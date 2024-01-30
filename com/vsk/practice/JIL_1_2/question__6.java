package com.vsk.practice.JIL_1_2;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class question__6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.print("Enter First Number : ");
        a = scanner.nextInt();
        System.out.print("Enter Second Number : ");
        b = scanner.nextInt();
        int condition;
        if (a>b){
            condition = 1;
        }
        else if (a<b){
            condition = 2;
        }
        else{
            condition = 0;
        }
        switch (condition){
            case 1:
                System.out.println("The maximum Number is " + a);
                break;
            case 2:
                System.out.println("The maximum Number is " + b);
                break;
            default:
                System.out.println("They both are equal");
        }

    }
}
