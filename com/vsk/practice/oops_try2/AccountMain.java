package com.vsk.practice.oops_try2;

public class AccountMain {
    public static void main(String[] args) {
        Account BobsAccount = new Account("2222",45,"padma","padma@gmail.om",
                "93483290840932840");
        BobsAccount.withdrawal(100.00);

        System.out.println(BobsAccount.getNumber());
    }
}
