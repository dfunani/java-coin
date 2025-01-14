package afrodevhub.com.java_coin.utils.constants;

public enum Role {
    SUPER("Super Administrator"),
    SYS_ADMIN("System Administrator"),
    TESTER("Application Tester"),
    USER("Application User"),
    DEVELOPER("Application developer");

    private final String role;

    Role(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return this.role;
    }

}
