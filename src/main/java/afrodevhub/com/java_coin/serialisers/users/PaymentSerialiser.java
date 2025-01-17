package afrodevhub.com.java_coin.serialisers.users;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import afrodevhub.com.java_coin.models.users.Payments;
import afrodevhub.com.java_coin.repository.users.PaymentRepository;
import afrodevhub.com.java_coin.serialisers.warehouse.LoginHistorySerialiser;
import afrodevhub.com.java_coin.utils.security.Encryption;
import afrodevhub.com.java_coin.utils.validators.UsersValidators;

@Service
public class PaymentSerialiser {
    @Autowired
    PaymentRepository paymentRepository;

    public String create() throws Exception {
        Payments payment = paymentRepository.save(new Payments());
        return payment.toString();
    }
}
