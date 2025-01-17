package afrodevhub.com.java_coin.utils.constants;

public enum DataSharingPreference {

    ACCOUNT("Share All Permissible Account Data."),
    PROFILE("Share Profile Data."),
    SETTINGS("Share Settings Data."),
    TRANSACTIONS("Share Transaction Data.");

    private final String dataSharingPreference;

    DataSharingPreference(String dataSharingPreference) {
        this.dataSharingPreference = dataSharingPreference;
    }

    @Override
    public String toString() {
        return this.dataSharingPreference;
    }
}
