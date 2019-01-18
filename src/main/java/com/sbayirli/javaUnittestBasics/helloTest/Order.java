package com.sbayirli.javaUnittestBasics.helloTest;

import java.util.Objects;

public class Order {
    Integer id;

    public Order(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
       return this.id == ((Order)o).getId();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
