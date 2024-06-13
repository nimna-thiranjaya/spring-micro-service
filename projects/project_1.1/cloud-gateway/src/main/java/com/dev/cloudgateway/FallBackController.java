package com.dev.cloudgateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallBackController {

    @RequestMapping("/payment")
    public String paymentServiceFallBackMethod() {
        return "Payment Service is taking longer than expected." +
                " Please try again later.";
    }

    @RequestMapping("/order")
    public String orderServiceFallBackMethod() {
        return "Order Service is taking longer than expected." +
                " Please try again later.";
    }
}
