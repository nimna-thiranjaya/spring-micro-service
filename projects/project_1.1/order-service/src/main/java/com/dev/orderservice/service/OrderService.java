package com.dev.orderservice.service;

import com.dev.orderservice.entity.Order;

public interface OrderService {
    Order saveOrder(Order order);
}
