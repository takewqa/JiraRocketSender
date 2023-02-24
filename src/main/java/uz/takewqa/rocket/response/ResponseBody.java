package uz.takewqa.rocket.response;

public class ResponseBody {
    private final String ts;
    private final String channel;
    private final boolean success;
    private final Message message;

    public ResponseBody(String ts, String channel, boolean success, Message message) {
        this.ts = ts;
        this.channel = channel;
        this.success = success;
        this.message = message;
    }

    public String getTs() {
        return ts;
    }

    public String getChannel() {
        return channel;
    }

    public boolean isSuccess() {
        return success;
    }

    public Message getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ResponseBody{" +
                "ts='" + ts + '\'' +
                ", channel='" + channel + '\'' +
                ", success=" + success +
                ", message=" + message +
                '}';
    }
}
