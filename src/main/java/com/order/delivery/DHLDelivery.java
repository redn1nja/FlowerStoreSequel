package com.order.delivery;

import com.logic.FlowerBucket;
import lombok.Getter;
import lombok.ToString;

import java.util.List;
@ToString @Getter
public class DHLDelivery implements Delivery {
    @Override
    public String deliver(List<FlowerBucket> items) {
        return "your delivery "+ items.toString() + " is being delivered by DHL postal service";
    }
}
