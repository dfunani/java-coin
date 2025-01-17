package afrodevhub.com.java_coin.repository.warehouse;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import afrodevhub.com.java_coin.models.warehouse.Card;

public interface CardRepository extends JpaRepository<Card, UUID> {
    // User findUserById(Long id);

}
