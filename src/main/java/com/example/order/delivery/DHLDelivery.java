package com.order.delivery;

import com.logic.FlowerBucket;

public class DHLDelivery implements Delivery {
    @Override
    public String deliver(FlowerBucket items) {
        return "your delivery "+ items.toString() + " is being delivered by DHL postal service";
    }
}
