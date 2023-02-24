package uz.takewqa.rocket.service.settings;

public interface PluginSettingService {
    String getLogin();

    String getPassword();

    String getRocketUrl();

    void setLogin(String login);

    void setPassword(String password);

    void setRocketUrl(String rocketUrl);

    boolean hasData();
}
