package uz.takewqa.rocket.request;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Nonnull;
import java.time.Instant;
import java.util.Collections;
import java.util.List;

public class Attachment {
    private String audioUrl;
    private String authorIcon;
    private String authorLink;
    private String authorName;
    private String color;
    private String imageUrl;
    private String messageLink;

    private String text;
    private String thumbUrl;
    private String title;
    @SerializedName("title_link")
    private String titleLink;
    private String videoUrl;
    private boolean collapsed;
    @SerializedName("title_link_download")
    private boolean titleLinkDownload;
    private final String ts = Instant.now().toString();
    private List<Field> fields;

    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(@Nonnull String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public String getAuthorIcon() {
        return authorIcon;
    }

    public void setAuthorIcon(@Nonnull String authorIcon) {
        this.authorIcon = authorIcon;
    }

    public String getAuthorLink() {
        return authorLink;
    }

    public void setAuthorLink(@Nonnull String authorLink) {
        this.authorLink = authorLink;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(@Nonnull String authorName) {
        this.authorName = authorName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(@Nonnull String color) {
        this.color = color;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(@Nonnull String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getMessageLink() {
        return messageLink;
    }

    public void setMessageLink(@Nonnull String messageLink) {
        this.messageLink = messageLink;
    }

    public String getText() {
        return text;
    }

    public void setText(@Nonnull String text) {
        this.text = text;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(@Nonnull String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(@Nonnull String title) {
        this.title = title;
    }

    public String getTitleLink() {
        return titleLink;
    }

    public void setTitleLink(@Nonnull String titleLink) {
        this.titleLink = titleLink;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(@Nonnull String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public boolean isCollapsed() {
        return collapsed;
    }

    public void setCollapsed(boolean collapsed) {
        this.collapsed = collapsed;
    }

    public boolean isTitleLinkDownload() {
        return titleLinkDownload;
    }

    public void setTitleLinkDownload(boolean titleLinkDownload) {
        this.titleLinkDownload = titleLinkDownload;
    }

    public String getTs() {
        return ts;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public void addField(Field field){
        if (this.fields == null){
            this.fields = Collections.singletonList(field);
        } else {
            this.fields.add(field);
        }
    }

    public static AttachmentBuilder builder(){
        return new AttachmentBuilder();
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "audioUrl='" + audioUrl + '\'' +
                ", authorIcon='" + authorIcon + '\'' +
                ", authorLink='" + authorLink + '\'' +
                ", authorName='" + authorName + '\'' +
                ", color='" + color + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", messageLink='" + messageLink + '\'' +
                ", text='" + text + '\'' +
                ", thumbUrl='" + thumbUrl + '\'' +
                ", title='" + title + '\'' +
                ", titleLink='" + titleLink + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", collapsed=" + collapsed +
                ", titleLinkDownload=" + titleLinkDownload +
                ", ts='" + ts + '\'' +
                ", fields=" + fields +
                '}';
    }

    private static final class AttachmentBuilder {
        private final Attachment attachment;

        private AttachmentBuilder() {
            attachment = new Attachment();
        }

        public AttachmentBuilder withAudioUrl(@Nonnull String audioUrl) {
            attachment.setAudioUrl(audioUrl);
            return this;
        }

        public AttachmentBuilder withAuthorIcon(@Nonnull String authorIcon) {
            attachment.setAuthorIcon(authorIcon);
            return this;
        }

        public AttachmentBuilder withAuthorLink(@Nonnull String authorLink) {
            attachment.setAuthorLink(authorLink);
            return this;
        }

        public AttachmentBuilder withAuthorName(@Nonnull String authorName) {
            attachment.setAuthorName(authorName);
            return this;
        }

        public AttachmentBuilder withColor(@Nonnull String color) {
            attachment.setColor(color);
            return this;
        }

        public AttachmentBuilder withImageUrl(@Nonnull String imageUrl) {
            attachment.setImageUrl(imageUrl);
            return this;
        }

        public AttachmentBuilder withMessageLink(String messageLink) {
            attachment.setMessageLink(messageLink);
            return this;
        }

        public AttachmentBuilder withText(@Nonnull String text) {
            attachment.setText(text);
            return this;
        }

        public AttachmentBuilder withThumbUrl(@Nonnull String thumbUrl) {
            attachment.setThumbUrl(thumbUrl);
            return this;
        }

        public AttachmentBuilder withTitle(@Nonnull String title) {
            attachment.setTitle(title);
            return this;
        }

        public AttachmentBuilder withTitleLink(@Nonnull String titleLink) {
            attachment.setTitleLink(titleLink);
            return this;
        }

        public AttachmentBuilder withVideoUrl(@Nonnull String videoUrl) {
            attachment.setVideoUrl(videoUrl);
            return this;
        }

        public AttachmentBuilder withCollapsed(boolean collapsed) {
            attachment.setCollapsed(collapsed);
            return this;
        }

        public AttachmentBuilder withTitleLinkDownload(boolean titleLinkDownload) {
            attachment.setTitleLinkDownload(titleLinkDownload);
            return this;
        }

        public AttachmentBuilder withFields(List<Field> fields) {
            attachment.setFields(fields);
            return this;
        }

        public AttachmentBuilder addField(Field field){
            if (attachment.getFields() == null){
                attachment.setFields(Collections.singletonList(field));
            } else {
                attachment.addField(field);
            }
            return this;
        }

        public Attachment build() {
            return attachment;
        }
    }
}
