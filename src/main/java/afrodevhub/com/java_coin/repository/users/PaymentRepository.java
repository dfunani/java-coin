package afrodevhub.com.java_coin.repository.users;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import afrodevhub.com.java_coin.models.users.Payments;
import afrodevhub.com.java_coin.models.warehouse.Card;

public interface PaymentRepository extends JpaRepository<Payments, UUID> {
    // User findUserById(Long id);

}
