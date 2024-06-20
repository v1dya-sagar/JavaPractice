package com.vsk.practice.miscellaneous.oops_try2;

public class VIPcustomerMain {
    public static void main(String[] args) {
        VIPcustomer Sagar = new VIPcustomer("Sagar",10000.00,"vidyasagar08123@gmail.com");
        System.out.println(Sagar.getVIPCreditLimit());
        VIPcustomer venkatesh = new VIPcustomer("Ajith",5000.00);
        System.out.println(venkatesh.getVIPCreditLimit());
        System.out.println(Sagar.getVIPName());
        System.out.println(venkatesh.getVIPEmail());
    }
}
