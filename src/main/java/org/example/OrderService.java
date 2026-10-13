package org.example;

public class OrderService {
    PaymentService paymentservice;

    void placeorder(){
        paymentservice.pay();
        System.out.println("order Placed");
    }
}
