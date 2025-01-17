package afrodevhub.com.java_coin.utils.constants;

public enum Communication {
    EMAIL("Email Messenger"),
    SMS("SMS"),
    CELL("Mobile Phone"),
    SLACK("Slack Messenger");

    private final String communication;

    Communication(String communication) {
        this.communication = communication;
    }

    @Override
    public String toString() {
        return this.communication;
    }
}
