package uz.takewqa.rocket.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uz.takewqa.rocket.request.RequestBody;
import uz.takewqa.rocket.response.ResponseBody;
import uz.takewqa.rocket.service.http.HttpService;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.IOException;
import java.util.Objects;

@Named
public class SenderManager {
    private final Logger log = LoggerFactory.getLogger(SenderManager.class);
    private final HttpService httpService;

    @Inject
    public SenderManager(HttpService httpService) {
        this.httpService = httpService;
    }

    protected ResponseBody sendMessage(@Nonnull RequestBody requestBody) throws IOException, InterruptedException {
        return httpService.send(requestBody);
    }

    protected boolean isValid() {
        try {
            return !Objects.equals(httpService.login().getStatus(), "error");
        } catch (IOException | InterruptedException e) {
            log.error(e.getMessage());
            return false;
        }
    }
}
