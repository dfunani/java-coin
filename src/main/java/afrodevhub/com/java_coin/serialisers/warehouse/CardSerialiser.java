package afrodevhub.com.java_coin.serialisers.warehouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import afrodevhub.com.java_coin.models.warehouse.Card;
import afrodevhub.com.java_coin.repository.warehouse.CardRepository;

@Service
public class CardSerialiser {
    @Autowired
    CardRepository cardRepository;

    public String create(String cardNumber, String cvvNumber, String pin) throws Exception {
        return cardRepository.save(new Card(cardNumber, cvvNumber, pin)).toString();
    }

}
