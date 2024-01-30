package com.vsk.practice.JIL_1_2;

import java.util.Scanner;

public class question__16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scanner.nextInt();
        int last =num%10;
        while (num>10){
            num /= 10;
        }
        System.out.println("Sum of first and last digit : " + (num + last));
    }
}
