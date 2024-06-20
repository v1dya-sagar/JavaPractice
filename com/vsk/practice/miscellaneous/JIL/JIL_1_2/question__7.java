package com.vsk.practice.miscellaneous.JIL.JIL_1_2;

import java.util.Scanner;

public class question__7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Enter a Number : ");
        num = scanner.nextInt();
        int condition;
        if(num>0){
            condition = 1;
        } else if (num<0) {
            condition = 2;
        }
        else{
            condition = 0;
        }
        switch (condition){
            case 1:
                System.out.println("Positive");
                break;
            case 2:
                System.out.println("Negative");
                break;
            default:
                System.out.println(condition);
                break;
        }
    }
}
