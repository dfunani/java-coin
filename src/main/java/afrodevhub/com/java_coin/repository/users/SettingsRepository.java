package afrodevhub.com.java_coin.repository.users;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import afrodevhub.com.java_coin.models.users.Settings;
import afrodevhub.com.java_coin.models.warehouse.Card;

public interface SettingsRepository extends JpaRepository<Settings, UUID> {
    // User findUserById(Long id);

}
