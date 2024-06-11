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
public class TransactionRequest {
    private Order order;
    private Payment payment;
}
