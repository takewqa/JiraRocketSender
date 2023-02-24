package uz.takewqa.rocket.service.settings;

import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
import com.atlassian.sal.api.pluginsettings.PluginSettings;
import com.atlassian.sal.api.pluginsettings.PluginSettingsFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class PluginSettingServiceImpl implements PluginSettingService{
    private final static Logger log = LoggerFactory.getLogger(PluginSettingServiceImpl.class);
    private final PluginSettings pluginSettings;
    private final static String PLUGIN_STORAGE_KEY = "uz.takewqa.rocket.test";


    @Inject
    public PluginSettingServiceImpl(@ComponentImport PluginSettingsFactory pluginSettingsFactory) {
        this.pluginSettings = pluginSettingsFactory.createGlobalSettings();
    }

    public String getLogin() {
        return this.getParam("login");
    }

    public String getPassword() {
        return this.getParam("password");
    }

    public String getRocketUrl() {
        return this.getParam("url");
    }

    public void setLogin(String login) {
        this.setParam("login", login);
    }

    public void setPassword(String password) {
        this.setParam("password", password);
    }

    public void setRocketUrl(String rocketUrl) {
        this.setParam("url", rocketUrl.endsWith("/") ? rocketUrl : rocketUrl + "/");
    }

    public boolean hasData() {
        return !(this.getRocketUrl().isEmpty() && this.getPassword().isEmpty() && this.getLogin().isEmpty());
    }

    private void setParam(String paramName, String value) {
        log.debug("SETTING: " + paramName + " value " + value);
        this.pluginSettings.remove(PLUGIN_STORAGE_KEY + paramName);
        this.pluginSettings.put(PLUGIN_STORAGE_KEY + paramName, value);
    }

    private String getParam(String paramName) {
        return this.pluginSettings.get(PLUGIN_STORAGE_KEY + paramName) == null ? "" : this.pluginSettings.get(PLUGIN_STORAGE_KEY + paramName).toString();
    }
}
