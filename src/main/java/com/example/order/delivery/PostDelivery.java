package com.order.delivery;

import com.logic.FlowerBucket;

public class PostDelivery implements Delivery{
    @Override
    public String deliver(FlowerBucket items) {
        return "your delivery "+ items.toString() + " is being delivered by post";
    }
}
