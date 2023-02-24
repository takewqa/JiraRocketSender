package uz.takewqa.rocket.auth;

public class Roles {
    private final String role;

    public Roles(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "role='" + role + '\'' +
                '}';
    }
}
