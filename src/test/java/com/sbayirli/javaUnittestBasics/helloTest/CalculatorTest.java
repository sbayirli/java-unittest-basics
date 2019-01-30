package com.sbayirli.javaUnittestBasics.helloTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CalculatorTest {
    /*Calculator class has two methods and we test all scenarios for both two methods
    * Test method names describe clearly what is tested in the method*/
    private Calculator calculator = new Calculator();

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {1,1,1},
                {1,1,1},
                {1,1,1},
                {1,1,1}
              /*  {40,10,4},
                {30,10,3},
                {24,6,4},
                {36,9,4},
                {12,3,4}*/
        });
    }

    private int height;
    private int width;
    private int area;

    public CalculatorTest(int area, int height, int width) {
        this.height = height;
        this.width = width;
        this.area = area;
    }

    @Test
    public void testAddTwoPositiveNumbers(){
        int number1 = 3;
        int number2 = 5;
        int result  = calculator.add(number1, number2);
        assertEquals(8, result);
    }

    @Test
    public void testAddTwoNegativeNumbers(){
        int number1 = -3;
        int number2 = -5;
        int result  = calculator.add(number1, number2);
        assertEquals(-8, result);
    }

    @Test
    public void testAddPositiveAndNegativeNumbers(){
        int number1 = 3;
        int number2 = -5;
        int result  = calculator.add(number1, number2);
        assertEquals(-2, result);
    }


    @Test
    public void testSubtractFromZero(){
        int number1 = 0;
        int number2 = 5;
        int result  = calculator.substract(number1, number2);
        assertEquals(-5, result);
    }

    @Test
    public void testSubtractFromBigNumber(){
        int number1 = 8;
        int number2 = 5;
        int result  = calculator.substract(number1, number2);
        assertEquals(3, result);
    }

    @Test
    public void testSubtractFromSmallNumber(){
        int number1 = 3;
        int number2 = 5;
        int result  = calculator.substract(number1, number2);
        assertEquals(-2, result);
    }

    @Test
    public void testCalculateAreaRectangleV1(){
        assertEquals(20 ,calculator.calculateAreaRectangle(10,2));
        assertEquals(40 ,calculator.calculateAreaRectangle(10,4));
        assertEquals(30 ,calculator.calculateAreaRectangle(10,3));
        assertEquals(24 ,calculator.calculateAreaRectangle(6,4));
        assertEquals(36 ,calculator.calculateAreaRectangle(9,4));
        assertEquals(12 ,calculator.calculateAreaRectangle(3,4));
    }

    @Test
    public void testCalculateAreaRectangleV2(){
        assertEquals(area ,calculator.calculateAreaRectangle(height,width));
    }
}
