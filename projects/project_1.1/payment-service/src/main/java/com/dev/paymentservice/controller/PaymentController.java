package com.dev.paymentservice.controller;

import com.dev.paymentservice.entity.Payment;
import com.dev.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
@RequiredArgsConstructor
public class PaymentController {
    private final PaymentService paymentService;

     @PostMapping("/doPayment")
    public Payment doPayment(@RequestBody Payment payment) {
        return paymentService.doPayment(payment);
    }

    @GetMapping("/{orderId}")
    public Payment findPaymentHistoryByOrderId(@PathVariable int orderId) {
        return paymentService.findPaymentHistoryByOrderId(orderId);
    }

}
