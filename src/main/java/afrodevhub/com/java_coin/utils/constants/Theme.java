package afrodevhub.com.java_coin.utils.constants;

public enum Theme {

    SYSTEM("Defaults to Device Settings."),
    DARK("DARK Theme Preferred."),
    LIGHT("Light Theme Preferred."),
    RED("Red Theme Preferred."),
    GREEN("Green Theme Preferred."),
    BLUE("Blue Theme Preferred.");

    private final String theme;

    Theme(String theme) {
        this.theme = theme;
    }

    @Override
    public String toString() {
        return this.theme;
    }
}
