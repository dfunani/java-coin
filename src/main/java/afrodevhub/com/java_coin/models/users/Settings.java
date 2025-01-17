package afrodevhub.com.java_coin.models.users;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

import afrodevhub.com.java_coin.utils.constants.Communication;
import afrodevhub.com.java_coin.utils.constants.DataSharingPreference;
import afrodevhub.com.java_coin.utils.constants.ProfileVisibility;
import afrodevhub.com.java_coin.utils.constants.Role;
import afrodevhub.com.java_coin.utils.constants.Status;
import afrodevhub.com.java_coin.utils.constants.Theme;
import afrodevhub.com.java_coin.utils.constants.Verification;
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
public class Settings {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private UUID settings_id;
    private UUID account_id;
    private String email_status;
    private String communication_status;
    private Boolean mfa_enabled;

    @Nullable
    private LocalDateTime mfa_last_used_date;
    private String profile_visibility_preference;
    private String[] data_sharing_preferences;
    private String communication_preference;
    private Boolean location_tracking_enabled;
    private Boolean cookies_enabled;
    private String theme_preference;
    private LocalDateTime created_date;
    private LocalDateTime updated_date;

    public Settings() {
        this.settings_id = UUID.randomUUID();
        this.account_id = UUID.randomUUID();
        this.email_status = Verification.UNVERIFIED.name();
        this.communication_status = Verification.UNVERIFIED.name();
        this.mfa_enabled = false;
        this.mfa_last_used_date = null;
        this.profile_visibility_preference = ProfileVisibility.PUBLIC.name();
        this.data_sharing_preferences = new String[] {};
        this.communication_preference = Communication.EMAIL.name();
        this.location_tracking_enabled = true;
        this.cookies_enabled = true;
        this.theme_preference = Theme.LIGHT.name();
        this.created_date = LocalDateTime.now();
        this.updated_date = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Settings ID: " + this.settings_id;
    }
}
