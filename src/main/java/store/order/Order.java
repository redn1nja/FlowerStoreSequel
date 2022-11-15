package store.order;

import store.Items.FlowerBucket;
import store.Items.Item;
import store.order.delivery.Delivery;
import store.order.payment.Payment;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Order {
    private final List<Item> items = new ArrayList<>();
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
        for (Item item: items) {
            price+=item.price();
        }
        return  price;
    }
    public String processOrder(){
        return "Your order is being processed.\n" + payment.pay(calculateTotalPrice()) + "\n" + delivery.deliver(items);
    }
    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }
}
