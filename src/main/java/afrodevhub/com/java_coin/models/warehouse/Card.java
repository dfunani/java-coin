package afrodevhub.com.java_coin.models.warehouse;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import afrodevhub.com.java_coin.utils.constants.CardType;
import afrodevhub.com.java_coin.utils.constants.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private UUID card_id;
    private String card_number;
    private String cvv_number;
    private String card_type;
    private String status;
    private String pin;
    private LocalDate expiration_date;
    private UUID salt_value;
    private LocalDateTime created_date;
    private LocalDateTime updated_date;

    public Card(String cardNumber, String cvvNumber, String pin) {
        this.card_id = UUID.randomUUID();
        this.card_number = cardNumber;
        this.cvv_number = cvvNumber;
        this.card_type = CardType.CHEQUE.toString(0);
        this.status = Status.NEW.toString();
        this.pin = pin;
        this.expiration_date = LocalDate.now().plusYears(5);
        this.salt_value = UUID.randomUUID();
        this.created_date = LocalDateTime.now();
        this.updated_date = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Card ID: " + this.card_id.toString();
    }
}
