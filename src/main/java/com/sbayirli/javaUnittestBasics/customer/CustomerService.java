package com.sbayirli.javaUnittestBasics.customer;

public class CustomerService {
    CustomerRepository repository = new CustomerRepository();
    NotificationMailService mailService = new NotificationMailService();

    public void saveCustomer(Customer customer){
        repository.saveCustomer(customer);
        mailService.sendNewCustomerMail(customer);
    }

    public CustomerRepository getRepository() {
        return repository;
    }

    public void setRepository(CustomerRepository repository) {
        this.repository = repository;
    }

    public NotificationMailService getMailService() {
        return mailService;
    }

    public void setMailService(NotificationMailService mailService) {
        this.mailService = mailService;
    }
}
