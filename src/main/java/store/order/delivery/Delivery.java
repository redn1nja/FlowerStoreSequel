package store.order.delivery;

import store.Items.FlowerBucket;
import store.Items.Item;

import java.util.List;

public interface Delivery {
    public String deliver(List<Item> items);
}
