package afrodevhub.com.java_coin.repository.users;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import afrodevhub.com.java_coin.models.users.Profiles;
import afrodevhub.com.java_coin.models.warehouse.Card;

public interface ProfileRepository extends JpaRepository<Profiles, UUID> {
    // User findUserById(Long id);

}
