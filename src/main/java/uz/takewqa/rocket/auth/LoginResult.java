package uz.takewqa.rocket.auth;

public class LoginResult {
    private final String status;
    private final Data data;

    public LoginResult(String status, Data data) {
        this.status = status;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public Data getData() {
        return data;
    }

    @Override
    public String toString() {
        return "LoginResult{" +
                "status='" + status + '\'' +
                ", data=" + data +
                '}';
    }
}
