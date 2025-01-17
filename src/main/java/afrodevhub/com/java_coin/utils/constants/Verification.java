package afrodevhub.com.java_coin.utils.constants;

public enum Verification {

    UNVERIFIED("New and Unverified"),
    VERIFIED("Verified"),
    VERIFYING("Verification Requested"),
    FAILED("Verification Failed"),
    EXPIRED("Verification Request Expired");

    private final String verification;

    Verification(String verification) {
        this.verification = verification;
    }

    @Override
    public String toString() {
        return this.verification;
    }
}
