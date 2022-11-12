package com.order.payment;

import com.order.payment.Payment;

public class PayPalPay implements Payment {
    @Override
    public String pay(double price) {
        return "payment is successful. total price:" + price;
    }
}
