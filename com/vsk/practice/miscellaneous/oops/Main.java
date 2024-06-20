package com.vsk.practice.miscellaneous.oops;

public class Main {
    public static void main(String[] args) {
        BankAccountChallenge sagar2 = new BankAccountChallenge();
        BankAccountChallenge sagar = new BankAccountChallenge("NO NUMBER",
                0.0,"NO PHONE","NO NAME","NO EMAIL");
        System.out.println(sagar2.getCustomerName());
        sagar.setNumber("654321");
        sagar.setCustomerName("sagar");
        System.out.println(sagar.getNumber());
        System.out.println(sagar.getCustomerName());
        System.out.println(sagar.getCustomerEmailAddress());
        System.out.println(sagar.getCustomerPhoneNumber());
    }
}
