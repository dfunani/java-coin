package afrodevhub.com.java_coin.serialisers.users;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import afrodevhub.com.java_coin.models.users.Accounts;
import afrodevhub.com.java_coin.repository.users.AccountRepository;
import afrodevhub.com.java_coin.serialisers.warehouse.LoginHistorySerialiser;
import afrodevhub.com.java_coin.utils.security.Encryption;
import afrodevhub.com.java_coin.utils.validators.UsersValidators;

@Service
public class AccountSerialiser {
    @Autowired
    AccountRepository accountRepository;

    public String create() throws Exception {
        Accounts account = accountRepository.save(new Accounts());
        return account.toString();
    }
}
