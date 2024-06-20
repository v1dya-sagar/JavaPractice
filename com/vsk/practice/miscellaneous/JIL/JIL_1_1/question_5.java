package com.vsk.practice.miscellaneous.JIL.JIL_1_1;
import java.util.Scanner;
public class question_5 {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year : ");
        year = scanner.nextInt();
        if(year%100 == 0 && year%400 ==0){
            System.out.println("It is a Leap Year");
        }
        else if(year%4 ==0){
            System.out.println("It is a Leap Year");
        }
        else {
            System.out.println("It is Not Leap Year");
        }
    }
}
