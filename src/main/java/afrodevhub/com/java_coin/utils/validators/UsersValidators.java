package afrodevhub.com.java_coin.utils.validators;

import java.util.regex.Pattern;

import afrodevhub.com.java_coin.utils.exceptions.UserExceptions;

public class UsersValidators {
    public static String email(String email) throws UserExceptions {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        if (!pattern.matcher(email).matches()) {
            throw new UserExceptions("User Error: Invalid Email.");
        }
        return null;
    }

    public static String password(String password) throws UserExceptions {
        Pattern pattern = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[!@#$%^&*])[A-Za-z\\d!@#$%^&*]{8,}$");
        if (!pattern.matcher(password).matches()) {
            throw new UserExceptions("User Error: Invalid Password");
        }
        return null;
    }
}
