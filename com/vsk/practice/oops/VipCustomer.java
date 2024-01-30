package com.vsk.practice.oops;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String customerEmailAddress;

    public VipCustomer() {
        this("default Name",50000.0,"def@def.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public VipCustomer(String name, double creditLimit) {
        this(name,creditLimit,"unknown@gmail.com");
    }

    public VipCustomer(String name, double creditLimit, String customerEmailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.customerEmailAddress = customerEmailAddress;
    }
}
