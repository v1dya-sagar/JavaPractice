package com.vsk.practice.DataStructures.Recursion;

public class PrintBoth {
    public static void main(String[] args) {
        printBoth(5);
    }
    public static void printBoth(int n){
        if(n == 0)
            return;
        System.out.println(n);
        printBoth(n-1);
        System.out.println(n);
    }
}
