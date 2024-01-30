package com.vsk.practice.exercise;

import java.util.Scanner;

public class DoubleIntegerSeriesPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1
        for (int j = 0; j < b; j++) {
            for (int i = a; i <= b; i++) {
                System.out.println(a);
            }
        }
    }
}
