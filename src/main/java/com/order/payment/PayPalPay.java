package com.order.payment;

import com.order.payment.Payment;
import lombok.Getter;
import lombok.ToString;

@ToString @Getter
public class PayPalPay implements Payment {
    @Override
    public String pay(double price) {
        return "payment is successful. total price:" + price;
    }
}
