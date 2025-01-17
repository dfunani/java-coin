package afrodevhub.com.java_coin.controllers.users;

import java.util.Optional;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import afrodevhub.com.java_coin.serialisers.users.AccountSerialiser;
import afrodevhub.com.java_coin.serialisers.users.PaymentSerialiser;
import afrodevhub.com.java_coin.serialisers.users.ProfileSerialiser;
import afrodevhub.com.java_coin.serialisers.users.SettingsSerialiser;
import afrodevhub.com.java_coin.serialisers.users.UserSerialiser;
import afrodevhub.com.java_coin.serialisers.warehouse.CardSerialiser;
import afrodevhub.com.java_coin.utils.exceptions.UserExceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/users")
public class UserControllers {
    @Autowired
    UserSerialiser userSerialiser;

    @Autowired
    CardSerialiser cardSerialiser;

    @Autowired
    AccountSerialiser accountSerialiser;

    @Autowired
    PaymentSerialiser paymentSerialiser;

    @Autowired
    ProfileSerialiser profileSerialiser;

    @Autowired
    SettingsSerialiser settingsSerialiser;

    @GetMapping
    public String getUser() throws Exception {
        Integer number = new Random().nextInt(1000);
        String user = userSerialiser.create("dfunani" + number.toString() + "@live.co.za", "password@123");
        String card = cardSerialiser.create("9112358942196932", "123", "325896");
        String account = accountSerialiser.create();
        String payment = paymentSerialiser.create();
        String profile = profileSerialiser.create();
        String settings = settingsSerialiser.create();
        return String.format("%s    %s  %s  %s  %s  %s", user,
                card,
                account,
                payment,
                profile,
                settings);
    }

    @ExceptionHandler(UserExceptions.class)
    public ResponseEntity<String> handleCustomException(UserExceptions ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleCustomException(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Internal Server Error.");
    }
}
