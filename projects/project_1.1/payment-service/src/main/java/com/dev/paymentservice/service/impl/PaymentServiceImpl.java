package com.dev.paymentservice.service.impl;

import com.dev.paymentservice.entity.Payment;
import com.dev.paymentservice.repository.PaymentRepository;
import com.dev.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {
    private final PaymentRepository paymentRepository;

    @Override
    public Payment doPayment(Payment payment) {
        payment.setPaymentStatus(generateRandomPaymentStatus());
        payment.setTransactionId(UUID.randomUUID().toString());
        return paymentRepository.save(payment);
    }

    @Override
    public String generateRandomPaymentStatus() {
        return Math.random() < 0.5 ? "success" : "failure";
    }

    @Override
    public Payment findPaymentHistoryByOrderId(int orderId) {
        return paymentRepository.findByOrderId(orderId);
    }
}
