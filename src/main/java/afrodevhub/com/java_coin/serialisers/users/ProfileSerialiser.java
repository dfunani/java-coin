package afrodevhub.com.java_coin.serialisers.users;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import afrodevhub.com.java_coin.models.users.Profiles;
import afrodevhub.com.java_coin.models.users.Users;
import afrodevhub.com.java_coin.repository.users.ProfileRepository;
import afrodevhub.com.java_coin.serialisers.warehouse.LoginHistorySerialiser;
import afrodevhub.com.java_coin.utils.security.Encryption;
import afrodevhub.com.java_coin.utils.validators.UsersValidators;

@Service
public class ProfileSerialiser {
    @Autowired
    ProfileRepository profileRepository;

    public String create() throws Exception {
        Profiles profile = profileRepository.save(new Profiles());
        return profile.toString();
    }
}
