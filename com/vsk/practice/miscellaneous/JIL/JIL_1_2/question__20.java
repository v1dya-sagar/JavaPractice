package com.vsk.practice.miscellaneous.JIL.JIL_1_2;

import java.util.Scanner;

public class question__20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scan.nextInt();
        int num1 = num;
        int reverse = 0;
        while(num!=0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }
        if(reverse == num1){
            System.out.println("It is a palindrome");
        }
        else {
            System.out.println("It is not a palindrome");
        }
    }
}
