package afrodevhub.com.java_coin.models.users;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

import afrodevhub.com.java_coin.utils.constants.Role;
import afrodevhub.com.java_coin.utils.constants.Status;
import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
// @NoArgsConstructor
@Entity
public class Accounts {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private UUID account_id;
    private UUID user_id;
    private String status;
    private LocalDateTime created_date;
    private LocalDateTime updated_date;

    public Accounts() {
        this.account_id = UUID.randomUUID();
        this.user_id = UUID.randomUUID();
        this.status = Status.NEW.name();
        this.updated_date = LocalDateTime.now();
        this.created_date = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Account ID: " + this.account_id;
    }
}
