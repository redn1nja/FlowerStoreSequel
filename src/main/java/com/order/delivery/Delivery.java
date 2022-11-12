package com.order.delivery;

import com.logic.FlowerBucket;

import java.util.List;

public interface Delivery {
    public String deliver(List<FlowerBucket> items);
}
