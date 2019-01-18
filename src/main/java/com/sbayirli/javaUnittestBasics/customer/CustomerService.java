package com.sbayirli.javaUnittestBasics.customer;

public class CustomerService {
    private CustomerRepository repository = new CustomerRepository();
    private NotificationMailService mailService = new NotificationMailService();

    public void saveCustomer(Customer customer){
        repository.saveCustomer(customer);
        mailService.sendNewCustomerMail(customer);
    }

    public void deleteCustomer(Integer customerId){
        repository.deleteCustomer(customerId);
    }

    public Customer getCustomer(Integer customerId){
        return repository.getCustomer(customerId);
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
