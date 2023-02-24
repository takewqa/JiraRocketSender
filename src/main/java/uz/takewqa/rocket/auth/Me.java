package uz.takewqa.rocket.auth;

import java.util.List;

public class Me {
    private final String _id;
    private final String name;
    private final String status;
    private final String statusConnection;
    private final String userName;
    private final String avatarUrl;
    private final Integer utcOffset;
    private final boolean active;
    private final List<Emails> emails;
    private final Settings settings;
    private final List<Roles> roles;

    public Me(
            String _id,
            String name,
            String status,
            String statusConnection,
            String userName,
            String avatarUrl,
            Integer utcOffset,
            boolean active,
            List<Emails> emails,
            Settings settings,
            List<Roles> roles
    ) {
        this._id = _id;
        this.name = name;
        this.status = status;
        this.statusConnection = statusConnection;
        this.userName = userName;
        this.avatarUrl = avatarUrl;
        this.utcOffset = utcOffset;
        this.active = active;
        this.emails = emails;
        this.settings = settings;
        this.roles = roles;
    }

    public String get_id() {
        return _id;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getStatusConnection() {
        return statusConnection;
    }

    public String getUserName() {
        return userName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public Integer getUtcOffset() {
        return utcOffset;
    }

    public boolean isActive() {
        return active;
    }

    public List<Emails> getEmails() {
        return emails;
    }

    public Settings getSettings() {
        return settings;
    }

    public List<Roles> getRoles() {
        return roles;
    }

    @Override
    public String toString() {
        return "Me{" +
                "_id='" + _id + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", statusConnection='" + statusConnection + '\'' +
                ", userName='" + userName + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", utcOffset=" + utcOffset +
                ", active=" + active +
                ", emails=" + emails +
                ", settings=" + settings +
                ", roles=" + roles +
                '}';
    }
}
