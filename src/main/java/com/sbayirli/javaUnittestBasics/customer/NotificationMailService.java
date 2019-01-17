package com.sbayirli.javaUnittestBasics.customer;

public class NotificationMailService {
    public void sendNewCustomerMail(Customer customer) {
        System.out.println("Dear " + customer.getName() + " your registiration is completed successfully!");
    }
}
