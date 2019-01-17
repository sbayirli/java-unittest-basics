package com.sbayirli.javaUnittestBasics.helloTest;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    /*Calculator class has two methods and we test all scenarios for both two methods
    * Test method names describe clearly what is tested in the method*/

    @Test
    public void testAddTwoPositiveNumbers(){
        Calculator calculator = new Calculator();
        int number1 = 3;
        int number2 = 5;
        int result  = calculator.add(number1, number2);
        Assert.assertEquals(8, result);
    }

    @Test
    public void testAddTwoNegativeNumbers(){
        Calculator calculator = new Calculator();
        int number1 = -3;
        int number2 = -5;
        int result  = calculator.add(number1, number2);
        Assert.assertEquals(-8, result);
    }

    @Test
    public void testAddPositiveAndNegativeNumbers(){
        Calculator calculator = new Calculator();
        int number1 = 3;
        int number2 = -5;
        int result  = calculator.add(number1, number2);
        Assert.assertEquals(-2, result);
    }


    @Test
    public void testSubtractFromZero(){
        Calculator calculator = new Calculator();
        int number1 = 0;
        int number2 = 5;
        int result  = calculator.substract(number1, number2);
        Assert.assertEquals(-5, result);
    }

    @Test
    public void testSubtractFromBigNumber(){
        Calculator calculator = new Calculator();
        int number1 = 8;
        int number2 = 5;
        int result  = calculator.substract(number1, number2);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testSubtractFromSmallNumber(){
        Calculator calculator = new Calculator();
        int number1 = 3;
        int number2 = 5;
        int result  = calculator.substract(number1, number2);
        Assert.assertEquals(-2, result);
    }

}
