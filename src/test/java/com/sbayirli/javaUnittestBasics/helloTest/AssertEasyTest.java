package com.sbayirli.javaUnittestBasics.helloTest;

import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(JUnitParamsRunner.class)
public class AssertEasyTest {
    private Calculator calculator = new Calculator();

   @Test
   @Parameterized.Parameters
    public void testCalculateRectangle(int width, int height, int area){

    }
}
