package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        OrderService obj=context.getBean(OrderService.class);
        obj.placeorder();


        /*
         first step -> Application Context create ,
         2nd Step-->   Read the Meta Data from config class get his annotation
         3rd Step->    Component Scaning in the given namr pakage or default pakage and sub pakages
         4th Step-->   Configuration Scanning
         5Th step -->  Bean Defination is ready;
         6Th Step -->  Bean Creation
         7th Step -->  Dependancy Injection
         8Th Step -->  Aware Interface function callback
         9t Step  -->  Initialization call back
         10th Step --> now we use our  object method and properties;


         */

    }
}
