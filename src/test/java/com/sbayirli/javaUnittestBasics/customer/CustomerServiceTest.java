package com.sbayirli.javaUnittestBasics.customer;

import com.sbayirli.javaUnittestBasics.customer.Customer;
import com.sbayirli.javaUnittestBasics.customer.CustomerRepository;
import com.sbayirli.javaUnittestBasics.customer.CustomerService;
import com.sbayirli.javaUnittestBasics.customer.NotificationMailService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Created by sibelbayirli on 1/17/19.
 */
public class CustomerServiceTest {
    private CustomerService customerService;
    private CustomerRepository repository;
    private NotificationMailService mailService;

    @Before
    public void setUp(){
        customerService = new CustomerService();
        repository = Mockito.mock(CustomerRepository.class);
        mailService = Mockito.mock(NotificationMailService.class);
        customerService.setRepository(repository);
        customerService.setMailService(mailService);
    }

    @Test
    public void testSaveCustomer(){
        Customer customer = new Customer();
        customerService.saveCustomer(customer);

        Mockito.verify(repository).saveCustomer(customer);
        Mockito.verify(mailService).sendNewCustomerMail(customer);
    }

    @Test
    public void testDeleteCustomer(){
        Customer customer = new Customer(1,"George ORWEL");
        customerService.deleteCustomer(1);
        Mockito.verify(repository).deleteCustomer(1);
    }

    @Test
    public void testGetCustomer(){
        Customer customer = new Customer(1,"George ORWEL");
        customerService.getCustomer(1);
        Mockito.verify(repository).getCustomer(1);
    }

}
