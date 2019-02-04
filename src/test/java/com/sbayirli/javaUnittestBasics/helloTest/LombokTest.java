package com.sbayirli.javaUnittestBasics.helloTest;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by sibelbayirli on 1/18/19.
 */

public class LombokTest {

    @Test
    public void lombokTest(){
        User user = new User();
        user.setName("Test");
        user.setPassword("Mmx10o3");
        System.out.println(user.toString());
    }



}