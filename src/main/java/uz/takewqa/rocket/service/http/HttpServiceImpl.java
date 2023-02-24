package uz.takewqa.rocket.service.http;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uz.takewqa.rocket.auth.Data;
import uz.takewqa.rocket.auth.LoginData;
import uz.takewqa.rocket.auth.LoginResult;
import uz.takewqa.rocket.exception.RocketException;
import uz.takewqa.rocket.request.RequestBody;
import uz.takewqa.rocket.response.ResponseBody;
import uz.takewqa.rocket.service.settings.PluginSettingService;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static uz.takewqa.rocket.service.Endpoint.LOGIN;
import static uz.takewqa.rocket.service.Endpoint.POST_MESSAGE;

@Named
public class HttpServiceImpl implements HttpService {
    private final Logger log = LoggerFactory.getLogger(HttpServiceImpl.class);
    private final PluginSettingService pluginSettingService;
    private final HttpClient client = HttpClient.newHttpClient();

    @Inject
    public HttpServiceImpl(PluginSettingService pluginSettingService) {
        this.pluginSettingService = pluginSettingService;
    }

    public LoginResult login() throws IOException, InterruptedException {
        String rocketUrl = pluginSettingService.getRocketUrl();

        if (rocketUrl == null || rocketUrl.isEmpty()) {
            throw new RocketException("You must setup rocket first");
        }

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(rocketUrl + LOGIN.getPath()))
                .header("Content-type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(
                        new LoginData(
                                pluginSettingService.getLogin(),
                                pluginSettingService.getPassword()
                        ).toJson()
                ))
                .build();

        return client.send(request, new JsonBodyHandler<>(LoginResult.class)).body();
    }


    public ResponseBody send(@Nonnull RequestBody requestBody) throws IOException, InterruptedException {
        LoginResult loginResult = login();
        if (loginResult != null) {
            Data data = loginResult.getData();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(pluginSettingService.getRocketUrl() + POST_MESSAGE.getPath()))
                    .POST(HttpRequest.BodyPublishers.ofString(new Gson().toJson(requestBody)))
                    .header("Content-type", "application/json")
                    .header("X-Auth-Token", data.getAuthToken())
                    .header("X-User-Id", data.getUserId())
                    .build();

            HttpResponse<ResponseBody> response = client.send(request, new JsonBodyHandler<>(ResponseBody.class));
            if (response.statusCode() != 200) {
                throw new RocketException("Failed send message: " + response.body().getMessage());
            }
            return response.body();
        }

        throw new RocketException("Failed login");
    }
}
