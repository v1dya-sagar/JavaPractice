package com.vsk.practice.miscellaneous.JIL.JIL_1_2;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class question__4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month;
        System.out.print("Enter the month name : ");
        month = scanner.nextLine();
        month = month.toLowerCase();
        switch(month){
            case "january": case "march":case "may":case "july":case "august":case "october":case "december":
                System.out.println("31 Days");
                break;

            case "february":
                System.out.println("29 Days");
                break;

            case "april":case "june":case "september":case "november":
                System.out.println("30 Days");
                break;
            default:
                System.out.println("Invalid entry");

        }
    }
}
