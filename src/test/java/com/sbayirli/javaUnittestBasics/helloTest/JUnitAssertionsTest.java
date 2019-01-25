package com.sbayirli.javaUnittestBasics.helloTest;

import com.sbayirli.javaUnittestBasics.customer.Customer;
import org.junit.*;

import static org.junit.Assert.assertEquals;


public class JUnitAssertionsTest {

    /*
    * assertEquals returns true because we override equals() method of Order class
    */
    @Test
    public void testAssertions() throws Exception{
        Order order1 = new Order(1);
        Order order2 = new Order(1);

        assertEquals(order1,order2);
        System.out.println(".");
    }
}
