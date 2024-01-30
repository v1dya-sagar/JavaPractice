package com.vsk.practice.challenges;

public class CountAndPrintSpecialCharacters {
    public static void main(String[] args) {
        String str = "Venkatesh Koteeswaran @!_1996!@#$%^&*()_+=-|]}{{;:'?.><,";
        String str2 = str.replaceAll("[a-zA-Z\\d, ]", "");
        System.out.println("Original Input : " + str);
        System.out.println("Special Characters : " + str2);
        System.out.println("Count of Special Characters : " + str2.length());
    }
}

