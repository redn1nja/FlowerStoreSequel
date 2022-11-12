package com.order;

import com.logic.FlowerBucket;
import com.order.delivery.Delivery;
import com.order.payment.Payment;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<FlowerBucket> items = new ArrayList<>();
    private Payment pay;
    private Delivery delivery;
}
