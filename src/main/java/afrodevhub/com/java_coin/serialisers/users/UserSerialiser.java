package afrodevhub.com.java_coin.serialisers.users;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import afrodevhub.com.java_coin.models.users.Users;
import afrodevhub.com.java_coin.repository.users.UserRepository;
import afrodevhub.com.java_coin.serialisers.warehouse.LoginHistorySerialiser;
import afrodevhub.com.java_coin.utils.security.Encryption;
import afrodevhub.com.java_coin.utils.validators.UsersValidators;

@Service
public class UserSerialiser {
    @Autowired
    UserRepository userRepository;

    @Autowired
    LoginHistorySerialiser loginHistorySerialiser;

    public String create(String email, String password) throws Exception {
        UsersValidators.email(email);
        UsersValidators.password(password);

        String encrypted_password = Encryption.Hash(password);
        Users user = userRepository.save(new Users(email, encrypted_password));
        String login = loginHistorySerialiser.create(user);
        System.out.println(login.toString());
        return user.toString();
    }
}
