package uz.takewqa.rocket.request;

import javax.annotation.Nonnull;
import java.util.Collections;
import java.util.List;

public class RequestBody {
    @Nonnull
    private final String text;
    @Nonnull
    private final String channel;
    private String alias;
    private String avatar;
    private String emoji;
    private String roomId;
    private List<Attachment> attachments;

    public RequestBody(@Nonnull String text,@Nonnull  String channel) {
        this.text = text;
        this.channel = channel;
    }

    @Nonnull
    public String getText() {
        return text;
    }

    @Nonnull
    public String getChannel() {
        return channel;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(@Nonnull String alias) {
        this.alias = alias;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(@Nonnull String avatar) {
        this.avatar = avatar;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(@Nonnull String emoji) {
        this.emoji = emoji;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(@Nonnull String roomId) {
        this.roomId = roomId;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public void addAttachment(Attachment attachment) {
        if (this.attachments == null) {
            this.attachments = Collections.singletonList(attachment);
        } else {
            this.attachments.add(attachment);
        }
    }
}
