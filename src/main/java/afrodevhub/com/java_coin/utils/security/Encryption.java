package afrodevhub.com.java_coin.utils.security;

import java.security.MessageDigest;

public class Encryption {
    public static String Hash(String text) throws Exception {
        MessageDigest client = MessageDigest.getInstance("SHA-256");
        byte[] hash_text = client.digest(text.getBytes());

        StringBuilder hexString = new StringBuilder();
        for (byte b : hash_text) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
}
