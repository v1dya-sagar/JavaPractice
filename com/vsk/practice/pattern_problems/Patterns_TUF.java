package com.vsk.practice.pattern_problems;

import java.util.*;
public class Patterns_TUF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        print1(n);
//        print2(n);
//        print3(n);
//        print4(n);
        print5(n);
    }

    public static void print1(int n){
//        * * *
//        * * *
//        * * *
        for (int i = 0; i < n; i++) {
            for(int j = 0 ; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void print2(int n){
//        *
//        * *
//        * * *
        for (int i = 0; i < n; i++) {
            for(int j = 0 ; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    public static void print3(int n){
//        1
//        1 2
//        1 2 3
        for (int i = 1; i <= n; i++) {
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void print4(int n){
//        1
//        2 2
//        3 3 3
        for (int i = 1; i <= n; i++) {
            for(int j = 1 ; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void print5(int n){
//        * * *
//        * *
//        *
        for (int i = 0; i < n; i++) {
            for(int j = n; j > i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
