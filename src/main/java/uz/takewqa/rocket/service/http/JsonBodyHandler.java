package uz.takewqa.rocket.service.http;

import com.google.gson.Gson;

import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class JsonBodyHandler<W> implements HttpResponse.BodyHandler<W> {
    private final Class<W> wClass;

    public JsonBodyHandler(Class<W> wClass) {
        this.wClass = wClass;
    }

    @Override
    public HttpResponse.BodySubscriber<W> apply(HttpResponse.ResponseInfo responseInfo) {
        return fromJson(wClass);
    }

    private static <T> HttpResponse.BodySubscriber<T> fromJson(Class<T> tClass) {
        HttpResponse.BodySubscriber<String> subscriber = HttpResponse.BodySubscribers.ofString(StandardCharsets.UTF_8);

        return HttpResponse.BodySubscribers.mapping(
                subscriber,
                (String body) -> new Gson().fromJson(body, tClass));
    }
}
