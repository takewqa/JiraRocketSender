package uz.takewqa.rocket.auth;

public class Settings {
    private final Preferences preferences;

    public Settings(Preferences preferences) {
        this.preferences = preferences;
    }

    public Preferences getPreferences() {
        return preferences;
    }

    @Override
    public String toString() {
        return "Settings{" +
                "preferences=" + preferences +
                '}';
    }
}
