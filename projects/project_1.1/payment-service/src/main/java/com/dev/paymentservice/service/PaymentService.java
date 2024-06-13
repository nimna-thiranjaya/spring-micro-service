package com.dev.paymentservice.service;

import com.dev.paymentservice.entity.Payment;

public interface PaymentService {
    Payment doPayment(Payment payment);
    String generateRandomPaymentStatus();

    Payment findPaymentHistoryByOrderId(int orderId);
}
