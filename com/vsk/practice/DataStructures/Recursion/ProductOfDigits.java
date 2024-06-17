package com.vsk.practice.DataStructures.Recursion;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(productOfDigits(1342));
    }
    public static int productOfDigits(int n){
        if(n < 10){
            return n;
        }
        return n%10 * productOfDigits(n/10);
    }
}
