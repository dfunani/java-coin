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
public class Payments {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private UUID payment_id;
    private UUID account_id;
    private UUID card_id;
    private String name;
    private String description;
    private String status;
    private Double balance;
    private LocalDateTime created_date;
    private LocalDateTime updated_date;

    public Payments() {
        this.payment_id = UUID.randomUUID();
        this.account_id = UUID.randomUUID();
        this.card_id = UUID.randomUUID();
        this.name = "name";
        this.description = "description";
        this.status = Status.NEW.name();
        this.balance = 0.0;
        this.created_date = LocalDateTime.now();
        this.updated_date = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Payment ID: " + this.payment_id;
    }
}
