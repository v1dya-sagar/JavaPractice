package com.vsk.practice.exercise;

public class MultiplyStringNumbers {

    public static void main(String[] args) {
        String num1 = "2" , num2 = "3";
        System.out.println(String.valueOf((new java.math.BigInteger(num1)).multiply(new java.math.BigInteger(num2))));
    }

}
