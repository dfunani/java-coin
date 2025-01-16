package afrodevhub.com.java_coin.serialisers.warehouse;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import afrodevhub.com.java_coin.models.users.Users;
import afrodevhub.com.java_coin.models.warehouse.LoginHistory;
import afrodevhub.com.java_coin.repository.warehouse.LoginHistoryRepository;

@Service
public class LoginHistorySerialiser {
    @Autowired
    LoginHistoryRepository loginHistoryRepository;

    public String create(Users user) throws Exception {
        return loginHistoryRepository.save(new LoginHistory(user)).toString();
    }
}
