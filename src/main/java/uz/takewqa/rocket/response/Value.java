package uz.takewqa.rocket.response;

import java.util.Map;

public class Value {
    private final String type;
    private final Map<String, ?> value;

    public Value(String type, Map<String, ?> value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public Map<String, ?> getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Value{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}
