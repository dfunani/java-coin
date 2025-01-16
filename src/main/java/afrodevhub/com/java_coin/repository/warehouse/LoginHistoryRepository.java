package afrodevhub.com.java_coin.repository.warehouse;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import afrodevhub.com.java_coin.models.warehouse.LoginHistory;

public interface LoginHistoryRepository extends JpaRepository<LoginHistory, UUID> {
    // User findUserById(Long id);

}