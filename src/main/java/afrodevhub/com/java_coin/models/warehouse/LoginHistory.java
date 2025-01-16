package afrodevhub.com.java_coin.models.warehouse;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import afrodevhub.com.java_coin.models.users.Users;
import afrodevhub.com.java_coin.utils.constants.Country;
import afrodevhub.com.java_coin.utils.constants.LoginMethod;
import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LoginHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private UUID login_id;
    
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Users user;
    
    private UUID session_id;
    private LocalDateTime login_date;
    private String login_location;
    private String login_device;
    private String login_method;
    private boolean logged_in;

    @Nullable()
    private LocalDateTime logout_date;
    @Nullable()
    private String authentication_token;

    public LoginHistory(Users user) {
        this.login_id = UUID.randomUUID();
        this.user = user;
        this.session_id = UUID.randomUUID();
        this.login_date = LocalDateTime.now();
        this.login_location = Country.AFGHANISTAN.toString(0);
        this.login_device = "Chrome";
        this.login_method = LoginMethod.EMAIL.toString();
        this.logged_in = true;
        this.logout_date = null;
        this.authentication_token = null;
    }

    @Override
    public String toString() {
        return "Login History ID: " + this.login_id.toString();
    }
}
