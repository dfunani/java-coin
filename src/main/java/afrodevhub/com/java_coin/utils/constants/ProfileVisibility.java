package afrodevhub.com.java_coin.utils.constants;

public enum ProfileVisibility {
    PRIVATE("Private"),
    PUBLIC("Public"),
    ADMIN("ADMIN");

    private final String profileVisibility;

    ProfileVisibility(String profileVisibility) {
        this.profileVisibility = profileVisibility;
    }

    @Override
    public String toString() {
        return this.profileVisibility;
    }
}
