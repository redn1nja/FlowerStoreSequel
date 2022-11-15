package store.order.delivery;

import store.Items.FlowerBucket;
import lombok.Getter;
import lombok.ToString;
import store.Items.Item;

import java.util.List;
@ToString @Getter
public class PostDelivery implements Delivery{
    @Override
    public String deliver(List<Item> items) {
        return "your delivery "+ items.toString() + " is being delivered by post";
    }
}
