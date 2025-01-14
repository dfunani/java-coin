package afrodevhub.com.java_coin.repository.users;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import afrodevhub.com.java_coin.models.users.Users;

public interface UserRepository extends JpaRepository<Users, UUID> {
    // User findUserById(Long id);
} 