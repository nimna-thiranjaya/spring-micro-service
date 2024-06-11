package com.dev.orderservice.service;

import com.dev.orderservice.common.TransactionRequest;
import com.dev.orderservice.common.TransactionResponse;
import com.dev.orderservice.entity.Order;

public interface OrderService {
    TransactionResponse saveOrder(TransactionRequest transactionRequest);
}
