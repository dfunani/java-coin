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

@Table(name = "users", uniqueConstraints = {"email"})
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @UniqueConstraint
    private UUID user_id;
    @Column(unique = true, nullable = false)
    private String email;
    private String password;
    private String status;
    private String salt_value;
    private String role;

    @Nullable
    private String login_history;

    private LocalDateTime created_date;
    private LocalDateTime updated_date;

    public Users(String email, String password) {
        this.user_id = UUID.randomUUID();
        this.email = email;
        this.password = password;
        this.status = Status.NEW.name();
        this.salt_value = "";
        this.role = Role.USER.name();
        this.login_history = null;
        this.updated_date = LocalDateTime.now();
        this.created_date = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "User ID: " + this.user_id;
    }
}
