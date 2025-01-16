package afrodevhub.com.java_coin.utils.constants;

public enum LoginMethod {
    EMAIL("User Email and Password"),
    GITHUB("Github SSO"),
    SLACK("Slack SSO"),
    GOOGLE("Google SSO"),
    FACEBOOK("Facebook SSO");

    private final String method;

    LoginMethod(String method) {
        this.method = method;
    }

    @Override
    public String toString() {
        return this.method;
    }
}
