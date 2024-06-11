package com.dev.orderservice.common;

import com.dev.orderservice.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TransactionResponse {
    private Order order;
    private double amount;
    private String transactionId;
    private String message;
}
