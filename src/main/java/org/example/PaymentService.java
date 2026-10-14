package org.example;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    PaymentService(){
        System.out.println("payment service constructor");
    }
    void pay(){
        System.out.println("Payment Done");
    }

}
