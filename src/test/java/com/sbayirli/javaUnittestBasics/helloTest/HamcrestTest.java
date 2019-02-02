package com.sbayirli.javaUnittestBasics.helloTest;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class HamcrestTest {

    @Test
    public void testBasicsWithStrings(){
        String text1 = "Apple" ;
        assertThat(text1, is(equalTo("Apple")));
        assertThat(text1, notNullValue());
        assertThat(text1, containsString("pp"));
        assertThat(text1, anyOf(containsString("pp"),nullValue(),containsString("A")));

    }

    @Test
    public void testBasicsWithLists(){
        List<String> countries = new ArrayList<String>(Arrays.asList("Turkey", "England", "Germany"));

        assertThat(countries, not(hasItem("France")));
        assertThat(countries, hasItems("Turkey", "England"));
        assertThat(countries, both(hasItem("England")).and(not(hasItem("France"))));
        assertThat(countries, allOf(notNullValue(),hasItems("Turkey", "Germany")));
        assertThat(countries, either(hasItem("Turkey")).or(hasItem("England")));
    }
}
