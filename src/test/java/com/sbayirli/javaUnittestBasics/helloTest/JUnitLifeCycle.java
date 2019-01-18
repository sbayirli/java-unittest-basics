package com.sbayirli.javaUnittestBasics.helloTest;

import org.junit.*;

public class JUnitLifeCycle {
    @BeforeClass
    /* @BeforeClass method must be static*/
    public static void beforeCls(){
        System.out.println("Runs at the beginning of the class");
    }

    @Before
    public void setUp(){
        System.out.println("Runs before all methods");
    }

    @Test
    public void testMethod1(){
        System.out.println("Method One is running");
    }

    @Test
    public void testMethod2(){
        System.out.println("Method Two is running");
    }

    @Test
    public void testMethod3(){
        System.out.println("Method Three is running");
    }

    @After
    public void tearDown(){
        System.out.println("Runs after all methods");
    }

    @AfterClass
    /*  @AfterClass method must be static*/
    public static void afterCls(){
        System.out.println("Runs at the ending of the class");
    }
}
