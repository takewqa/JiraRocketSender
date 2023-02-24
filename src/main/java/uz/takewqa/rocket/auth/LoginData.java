package uz.takewqa.rocket.auth;

import com.google.gson.Gson;

public class LoginData {
    private final String user;
    private final String password;

    public LoginData(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
    @Override
    public String toString() {
        return "LoginData{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
