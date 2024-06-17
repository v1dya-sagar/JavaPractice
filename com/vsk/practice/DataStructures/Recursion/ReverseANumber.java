package com.vsk.practice.DataStructures.Recursion;

public class ReverseANumber {
    public static void main(String[] args) {
        System.out.println(reverse(1342));
    }
    public static int reverse(int n){
        if(n < 10){
            return n;
        }
        return n%10 * 10 +  reverse(n/10);
    }
}
