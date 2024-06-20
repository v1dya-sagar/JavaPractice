package com.vsk.practice.miscellaneous.JIL.JIL_1_2;

import java.util.Scanner;

public class question__3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,y;
        System.out.print("Enter the Base : ");
        x = scanner.nextInt();
        System.out.print("Enter the Exponent : ");
        y = scanner.nextInt();
        int power = 1;
        for(int i = 1; i <= y; i++){
            power *= x;
        }
        System.out.println("The value = " + power );
    }
}
