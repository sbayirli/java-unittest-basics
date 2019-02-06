package com.sbayirli.javaUnittestBasics.helloTest;

import org.assertj.core.api.AbstractListAssert;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.Condition;
import org.assertj.core.api.ObjectAssert;
import org.assertj.core.groups.Tuple;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.extractProperty;
import static org.assertj.core.api.Assertions.tuple;

/**
 * Created by sibelbayirli on 2/3/19.
 */
public class AssertJTest {

    List<String> turkishCities = new ArrayList<String>(Arrays.asList("Ankara","Erzurum","Tokat"));

    List<String> frenchCities = new ArrayList<String>(Arrays.asList("Nice","Paris","Cannes"));

    @Test
    public void stringTest() {
        String text = "Sibel";
        assertThat(text)
                .describedAs("This is stringTest exception")
                .isEqualTo("Sibel")
                .containsOnlyOnce("i")
                .isNotNull()
                .contains("bel");
    }

    @Test
    public void easyListTest() {


        assertThat(turkishCities)
                .contains("Ankara")
                .doesNotContain("Paris")
                .doesNotHaveDuplicates();

        /*Writing our own condition*/
        List<String> cities1 = new ArrayList<String>(Arrays.asList("Ankara", "Erzurum"));

        List<String> cities2 = new ArrayList<String>(Arrays.asList("Paris", "Nice"));


        assertThat(cities1)
                .describedAs("List does not match with Turkish cities!")
                .have(ifTurkishCity());


        assertThat(cities2)
                .describedAs("List does not match with French cities!")
                .have(ifFrenchCity());


    }

    @Test
    public void complexListTest(){

        List<User> listUser = new ArrayList<>();
        listUser.add(new User("Sibel","tt"));
        listUser.add(new User("Seray","123"));
        listUser.add(new User("Ahmet","111"));
        listUser.add(new User("Ahmet","234"));
        listUser.add(new User("Mithat","tt"));
        listUser.add(new User("Merve","123"));

        assertThat(listUser).extracting("name")
                            .contains("Ahmet");

        AbstractListAssert<?, List<? extends Tuple>, Tuple, ObjectAssert<Tuple>> contains = assertThat(listUser).extracting("name", "password")
                .contains(
                        tuple("Sibel", "tt"),
                        tuple("Mithat", "tt")
                );

        assertThat(extractProperty("name",String.class)
                .from(listUser))
                .containsExactly("Sibel","Seray","Ahmet", "Ahmet","Mithat", "Merve");


    }


    private Condition<? super String> ifTurkishCity () {
        return new Condition<String>() {

            @Override
            public boolean matches(String s) {
                return turkishCities.contains(s);
            }

        };
    }

    private Condition<? super String> ifFrenchCity () {
        return new Condition<String>() {

            @Override
            public boolean matches(String s) {
                return frenchCities.contains(s);
            }

        };
    }
}
