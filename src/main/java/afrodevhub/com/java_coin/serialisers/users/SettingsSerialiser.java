package afrodevhub.com.java_coin.serialisers.users;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import afrodevhub.com.java_coin.models.users.Settings;
import afrodevhub.com.java_coin.repository.users.SettingsRepository;
import afrodevhub.com.java_coin.serialisers.warehouse.LoginHistorySerialiser;
import afrodevhub.com.java_coin.utils.security.Encryption;
import afrodevhub.com.java_coin.utils.validators.UsersValidators;

@Service
public class SettingsSerialiser {
    @Autowired
    SettingsRepository settingsRepository;

    public String create() throws Exception {
        Settings settings = settingsRepository.save(new Settings());
        return settings.toString();
    }
}
