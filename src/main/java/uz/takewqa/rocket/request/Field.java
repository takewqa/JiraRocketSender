package uz.takewqa.rocket.request;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Nonnull;
import java.util.Objects;

public class Field {
    @Nonnull
    private final String title;
    @Nonnull
    private final String value;
    @SerializedName("short")
    private final boolean isShort;

    public Field(@Nonnull String title, @Nonnull String value, boolean isShort) {
        this.title = title;
        this.value = value;
        this.isShort = isShort;
    }

    @Nonnull
    public String getTitle() {
        return title;
    }

    @Nonnull
    public String getValue() {
        return value;
    }

    public boolean isShort() {
        return isShort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Field field = (Field) o;
        return isShort == field.isShort && title.equals(field.title) && value.equals(field.value);
    }

    @Override
    public String toString() {
        return "Field{" +
                "title='" + title + '\'' +
                ", value='" + value + '\'' +
                ", isShort=" + isShort +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, value, isShort);
    }
}
