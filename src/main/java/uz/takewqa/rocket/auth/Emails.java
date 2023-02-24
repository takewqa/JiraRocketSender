package uz.takewqa.rocket.auth;

public class Emails {
    private final String address;
    private final boolean verified;

    public Emails(String address, boolean verified) {
        this.address = address;
        this.verified = verified;
    }

    public String getAddress() {
        return address;
    }

    public boolean isVerified() {
        return verified;
    }

    @Override
    public String toString() {
        return "Emails{" +
                "address='" + address + '\'' +
                ", verified=" + verified +
                '}';
    }
}
