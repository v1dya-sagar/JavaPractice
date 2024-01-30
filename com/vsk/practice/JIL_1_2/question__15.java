package com.vsk.practice.JIL_1_2;

import java.util.Scanner;

public class question__15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scanner.nextInt();
        System.out.println("last Digit : " + num%10);
        while (num>10){
            num /= 10;
        }
        System.out.println("First Digit : " + num);
    }
}
