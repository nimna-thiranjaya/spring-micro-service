package com.dev.orderservice.service.impl;

import com.dev.orderservice.common.Payment;
import com.dev.orderservice.common.TransactionRequest;
import com.dev.orderservice.common.TransactionResponse;
import com.dev.orderservice.entity.Order;
import com.dev.orderservice.repository.OrderRepository;
import com.dev.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class OderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    private final RestTemplate restTemplate;


    @Override
    public TransactionResponse saveOrder(TransactionRequest transactionRequest) {
        String response = "";
        Order order = transactionRequest.getOrder();
        Order createdOrder = orderRepository.save(order);

        Payment payment = transactionRequest.getPayment();
        payment.setOrderId(createdOrder.getId());
        payment.setAmount(createdOrder.getPrice());

        Payment createdPayment = restTemplate.postForObject("http://localhost:9191/payment/doPayment", payment, Payment.class);

        if(createdPayment != null && createdPayment.getPaymentStatus().equals("success")) {
            response = "Payment processing successful and order placed";
        } else {
            response = "Payment processing failed and order added to cart";
        }

        TransactionResponse transactionResponse = new TransactionResponse();
        transactionResponse.setOrder(order);
        transactionResponse.setTransactionId(createdPayment.getTransactionId());
        transactionResponse.setAmount(order.getPrice());
        transactionResponse.setMessage(response);

        return transactionResponse;
    }
}
