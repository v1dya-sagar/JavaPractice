package com.vsk.practice.miscellaneous.JIL.JIL_1_2;

import java.util.Scanner;

public class question__14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number");
        int num = scanner.nextInt();
        int count = 0;
        while(num != 0 ){
            num /= 10;
            count++;
        }
        System.out.println("count  =  " + count);
    }
}
