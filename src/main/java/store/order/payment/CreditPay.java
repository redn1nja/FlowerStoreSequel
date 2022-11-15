package store.order.payment;

import lombok.Getter;
import lombok.ToString;

@ToString @Getter
public class CreditPay implements Payment {
    @Override
    public String pay(double price) {
        return "payment is successful. total price:" + price;
    }
}
