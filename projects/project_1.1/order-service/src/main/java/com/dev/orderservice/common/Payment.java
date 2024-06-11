package com.dev.orderservice.common;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Payment {

    private int paymentId;
    private String paymentStatus;
    private String transactionId;

    private int orderId;
    private double amount;
}
