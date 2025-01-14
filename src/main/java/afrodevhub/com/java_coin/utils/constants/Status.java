package afrodevhub.com.java_coin.utils.constants;

public enum Status {
    NEW("Newly Created."),
    ACTIVE("Actively is in Use."),
    INACTIVE("Not Actively in Use."),
    DISABLED("Can't be used."),
    DELETED("Has been Deleted.");

    private final String status;

    Status(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return this.status;
    }
}