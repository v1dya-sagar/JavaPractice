package com.vsk.practice.miscellaneous.oops;

public class MainForVipCustomer {
    public static void main(String[] args) {
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob",100);
        System.out.println(person2.getName() + "creditLimit " + person2.getCustomerEmailAddress());

        VipCustomer person3 = new VipCustomer("tim",1000,"tim@gmail.com");
        System.out.println(person3.getCustomerEmailAddress());
        System.out.println(person3.getName());
        System.out.println(person3.getCreditLimit());

    }


}
