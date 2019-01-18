package com.sbayirli.javaUnittestBasics.customer;

public class Customer {
    private Integer id;
    private String name;

    public Customer() {
       super();
    }

    public Customer(Integer id) {
        this.id = id;
    }

    public Customer(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
