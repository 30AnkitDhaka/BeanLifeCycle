package org.example;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class OrderService implements ApplicationContextAware {
    PaymentService paymentservice;
    OrderService (PaymentService paymentservice){
        System.out.println("orderservice");
        this.paymentservice=paymentservice;
    }

    void placeorder(){
        paymentservice.pay();
        System.out.println("order Placed");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext);
    }
}
