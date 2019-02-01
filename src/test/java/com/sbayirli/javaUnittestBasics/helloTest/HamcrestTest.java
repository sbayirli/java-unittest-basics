package com.sbayirli.javaUnittestBasics.helloTest;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class HamcrestTest {

    @Test
    public void testBasics(){
        String text1 = "Apple" ;
        Assert.assertThat(text1, is(equalTo("Apple")));
    }
}
