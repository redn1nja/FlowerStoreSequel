package com.order.payment;

public class CreditPay implements Payment {
    @Override
    public String pay(double price) {
        return "payment is successful. total price:" + price;
    }
}
