package uz.takewqa.rocket.webwork;

import com.atlassian.jira.web.action.JiraWebActionSupport;
import uz.takewqa.rocket.service.ValidationService;
import uz.takewqa.rocket.service.settings.PluginSettingService;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

public class RocketWebAction extends JiraWebActionSupport {
    private final Map<String, String> status = new HashMap<>();
    private final PluginSettingService pluginSettingService;
    private final ValidationService validationService;
    private String rocketLogin;
    private String rocketPassword;
    private String rocketUrl;

    @Inject
    public RocketWebAction(PluginSettingService pluginSettingService, ValidationService validationService) {
        this.pluginSettingService = pluginSettingService;
        this.validationService = validationService;
        this.rocketLogin = this.pluginSettingService.getLogin();
        this.rocketPassword = this.pluginSettingService.getPassword();
        this.rocketUrl = this.pluginSettingService.getRocketUrl();
    }

    @Override
    public String doExecute() {
        return SUCCESS;
    }

    public String doSave() {
        this.pluginSettingService.setLogin(this.rocketLogin);
        this.pluginSettingService.setPassword(this.rocketPassword);
        this.pluginSettingService.setRocketUrl(this.rocketUrl);
        validateData();

        return SUCCESS;
    }


    private void validateData() {
        if (pluginSettingService.hasData()) {
            if (validationService.validate()) {
                this.status.put("error", "Failed authorise");
            } else {
                this.status.put("success", "Authorise successfully");
            }
        }
    }

    public Map<String, String> getStatus() {
        return this.status;
    }

    public String getRocketLogin() {
        return rocketLogin;
    }

    public void setRocketLogin(String rocketLogin) {
        this.rocketLogin = rocketLogin;
    }

    public String getRocketPassword() {
        return rocketPassword;
    }

    public void setRocketPassword(String rocketPassword) {
        this.rocketPassword = rocketPassword;
    }

    public String getRocketUrl() {
        return rocketUrl;
    }

    public void setRocketUrl(String rocketUrl) {
        this.rocketUrl = rocketUrl;
    }

}
