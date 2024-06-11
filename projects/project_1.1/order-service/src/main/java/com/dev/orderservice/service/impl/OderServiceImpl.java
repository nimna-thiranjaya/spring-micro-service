package com.dev.orderservice.service.impl;

import com.dev.orderservice.entity.Order;
import com.dev.orderservice.repository.OrderRepository;
import com.dev.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;


    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }
}
