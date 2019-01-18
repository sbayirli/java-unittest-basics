package com.sbayirli.javaUnittestBasics.customer;

public class CustomerRepository {
    public void saveCustomer(Customer customer) {
        System.out.println("Customer is being saved");
    }

    public void deleteCustomer(Integer customerId) {
        System.out.println("Customer with id:"+customerId+" is deleted! ");
    }

    public Customer getCustomer(Integer customerId){
        return new Customer(customerId);
    }
}
