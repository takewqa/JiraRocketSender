package uz.takewqa.rocket.service;

/**
 * @author Vladimir Troshin
 * @since 15.02.2023
 */
public enum Endpoint {
    LOGIN("api/v1/login"),
    POST_MESSAGE("api/v1/chat.postMessage");

    private final String path;

    Endpoint(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
