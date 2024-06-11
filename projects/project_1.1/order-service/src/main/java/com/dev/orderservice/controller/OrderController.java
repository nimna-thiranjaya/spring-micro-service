package com.dev.orderservice.controller;

import com.dev.orderservice.common.Payment;
import com.dev.orderservice.common.TransactionRequest;
import com.dev.orderservice.common.TransactionResponse;
import com.dev.orderservice.entity.Order;
import com.dev.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/bookOrder")
    public TransactionResponse bookOrder(@RequestBody TransactionRequest transactionRequest) {
        return orderService.saveOrder(transactionRequest);
    }
}
