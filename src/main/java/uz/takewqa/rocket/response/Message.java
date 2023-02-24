package uz.takewqa.rocket.response;

import com.google.gson.annotations.SerializedName;

public class Message {
    private final String alias;
    private final String msg;
    @SerializedName("parseUrls")
    private final boolean isParseUrls;
    @SerializedName("groupable")
    private final boolean isGroupable;
    private final String ts;
    private final String rid;
    @SerializedName("_updatedAt")
    private final String updatedAt;
    @SerializedName("_id")
    private final String id;
    @SerializedName("u")
    private final User user;

    public Message(String alias, String msg, boolean isParseUrls, boolean isGroupable, String ts, String rid, String updatedAt, String id, User user) {
        this.alias = alias;
        this.msg = msg;
        this.isParseUrls = isParseUrls;
        this.isGroupable = isGroupable;
        this.ts = ts;
        this.rid = rid;
        this.updatedAt = updatedAt;
        this.id = id;
        this.user = user;
    }

    public String getAlias() {
        return alias;
    }

    public String getMsg() {
        return msg;
    }

    public boolean isParseUrls() {
        return isParseUrls;
    }

    public boolean isGroupable() {
        return isGroupable;
    }

    public String getTs() {
        return ts;
    }

    public String getRid() {
        return rid;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Message{" +
                "alias='" + alias + '\'' +
                ", msg='" + msg + '\'' +
                ", isParseUrls=" + isParseUrls +
                ", isGroupable=" + isGroupable +
                ", ts='" + ts + '\'' +
                ", rid='" + rid + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", id='" + id + '\'' +
                ", user=" + user +
                '}';
    }
}
