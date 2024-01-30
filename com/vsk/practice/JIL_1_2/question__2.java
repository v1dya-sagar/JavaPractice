package com.vsk.practice.JIL_1_2;

import java.util.Scanner;

public class question__2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days;
        System.out.print("Enter Days : ");
        days = scanner.nextInt();
        double years = days/365;
        double weeks = days/7;
        System.out.println("Year(s) : " + years + " years");
        System.out.println("Week(s) : " + weeks + " weeks");
    }
}
