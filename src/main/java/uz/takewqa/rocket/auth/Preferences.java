package uz.takewqa.rocket.auth;

import java.util.Map;

public class Preferences {
    private final Map<String, ?> preferencesMap;

    public Preferences(Map<String, ?> preferencesMap) {
        this.preferencesMap = preferencesMap;
    }

    public Map<String, ?> getPreferencesMap() {
        return preferencesMap;
    }

    @Override
    public String toString() {
        return "Preferences{" +
                "preferencesMap=" + preferencesMap +
                '}';
    }
}
