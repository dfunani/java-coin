package afrodevhub.com.java_coin.models.users;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

import afrodevhub.com.java_coin.utils.constants.Country;
import afrodevhub.com.java_coin.utils.constants.Gender;
import afrodevhub.com.java_coin.utils.constants.Language;
import afrodevhub.com.java_coin.utils.constants.Occupation;
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
public class Profiles {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private UUID profile_id;
    private UUID account_id;
    private String first_name;
    private String last_name;
    private String username;
    private String date_of_birth;
    private String gender;

    @Nullable
    private String profile_picture;
    private String mobile_number;
    private String country;
    private String language;
    private String biography;
    private String occupation;
    private String[] interests;
    private HashMap<String, String> social_media_links;
    private String status;
    private LocalDateTime created_date;
    private LocalDateTime updated_date;

    public Profiles() {
        this.profile_id = UUID.randomUUID();
        this.account_id = UUID.randomUUID();
        this.first_name = "Test First Name";
        this.last_name = "Test Last Name";
        this.username = "Test UserName";
        this.date_of_birth = "1991-12-31";
        this.gender = Gender.MALE.name();
        this.profile_picture = null;
        this.mobile_number = "0685642078";
        this.country = Country.AFGHANISTAN.name();
        this.language = Language.ENGLISH.name();
        this.biography = "Bio";
        this.occupation = Occupation.ACCOUNTANT.name();
        this.interests = new String[] {};
        this.social_media_links = new HashMap<String, String>();
        this.status = Status.NEW.name();
        this.created_date = LocalDateTime.now();
        this.updated_date = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Profile ID: " + this.profile_id;
    }
}
