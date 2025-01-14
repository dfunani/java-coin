package afrodevhub.com.java_coin.controllers.users;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import afrodevhub.com.java_coin.serialisers.users.UserSerialiser;
import afrodevhub.com.java_coin.utils.exceptions.UserExceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/users")
public class UserControllers {
    @Autowired
    UserSerialiser userSerialiser;

    @GetMapping
    public String getUser() throws Exception {
        final String user = userSerialiser.create("dfunani@live.co.za", "password@123");
        return user;
    }

    @ExceptionHandler(UserExceptions.class)
    public ResponseEntity<String> handleCustomException(UserExceptions ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ex.getMessage());
    }
}
