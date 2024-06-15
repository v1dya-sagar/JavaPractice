package com.vsk.practice.DataStructures.Recursion;

public class SumOfNTo1 {
    public static void main(String[] args) {
        System.out.println(sumOfNTo1(5));
    }
    public static int sumOfNTo1(int n){
        if(n == 0){
            return 0;
        }
        return n + sumOfNTo1(n-1);
    }
}
