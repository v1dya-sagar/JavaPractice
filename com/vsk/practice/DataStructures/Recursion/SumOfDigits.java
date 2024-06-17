package com.vsk.practice.DataStructures.Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1342));
    }
    public static int sumOfDigits(int n){
        if(n < 10){
            return n;
        }
        return n%10 + sumOfDigits(n/10);
    }
}
