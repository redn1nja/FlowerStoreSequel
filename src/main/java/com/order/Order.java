package com.order;

import com.logic.FlowerBucket;
import com.order.delivery.Delivery;
import com.order.payment.Payment;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;
@Getter
public class Order {
    private final List<FlowerBucket> items = new ArrayList<>();
    private Payment payment;
    private Delivery delivery;
    public void setPaymentStrategy(Payment payment){
        this.payment = payment;
    }
    public void setDeliveryStrategy(Delivery delivery){
        this.delivery = delivery;
    }
    public double calculateTotalPrice(){
        double price = 0;
        for (FlowerBucket item: items) {
            price+=item.getPrice();
        }
        return  price;
    }
    public String processOrder(){
        return "Your order is being processed.\n" + payment.pay(calculateTotalPrice()) + "\n" + delivery.deliver(items);
    }
    public void addItem(FlowerBucket bucket){
        items.add(bucket);
    }

    public void removeItem(FlowerBucket bucket){
        items.remove(bucket);
    }
}
