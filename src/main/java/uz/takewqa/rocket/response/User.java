package uz.takewqa.rocket.response;

import java.util.Objects;

public class User {
    private final String _id;
    private final String username;
    private final String name;

    public User(
            String _id,
            String username,
            String name
    ) {
        this._id = _id;
        this.username = username;
        this.name = name;
    }

    public String get_id() {
        return _id;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return _id.equals(user._id) && username.equals(user.username) && name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_id, username, name);
    }

    @Override
    public String toString() {
        return "User{" +
                "_id='" + _id + '\'' +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
