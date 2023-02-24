package uz.takewqa.rocket.auth;

public class Data {
    private final String authToken;
    private final String userId;

    public Data(String authToken, String userId) {
        this.authToken = authToken;
        this.userId = userId;
    }

    public String getAuthToken() {
        return authToken;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "Data{" +
                "authToken='" + authToken + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
