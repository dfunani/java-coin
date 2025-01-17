package afrodevhub.com.java_coin.utils.constants;

public enum Gender {

    MALE("Male", "M"),
    FEMALE("Female", "F"),
    OTHER("Other", "O");

    private final String[] gender;

    Gender(String longName, String shortName) {
        this.gender = new String[] {
                longName, shortName
        };
    }

    public String toString(Integer index) {
        return this.gender[index];
    }
}
