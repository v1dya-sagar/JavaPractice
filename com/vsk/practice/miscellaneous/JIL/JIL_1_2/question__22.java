package com.vsk.practice.miscellaneous.JIL.JIL_1_2;

import java.util.Scanner;

public class question__22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a Number : ");
        int num = scan.nextInt();
        int fact = 1;
        for(int i = 1;i<=num;i++){
            fact *= i;
        }
        System.out.println("factorial = " + fact);
    }
}
