package com.vsk.practice.JIL_1_2;

import java.util.Scanner;

public class question__18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter a number : ");
        number = scanner.nextInt();
        int digit = 0 , sum =0;
        while(number > 0)
        {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println("sum : " + sum);
    }
}
