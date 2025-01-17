package afrodevhub.com.java_coin.utils.constants;

public enum CardType {
    CHEQUE("cheque", "1991"),
    SAVINGS("savings", "1992"),
    CREDIT("credit", "1993");

    private final String[] cardType;

    CardType(String type, String code) {
        this.cardType = new String[] {
                type, code
        };
    }

    public String toString(Integer index) {
        return this.cardType[index];
    }
}
