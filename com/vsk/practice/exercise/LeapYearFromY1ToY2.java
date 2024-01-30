package com.vsk.practice.exercise;

import java.util.Scanner;

public class LeapYearFromY1ToY2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int y1 = scan.nextInt();
        int y2 = scan.nextInt();

        for(; y1 <= y2 ; y1++){
            if((y1 % 4 == 0 && y1 % 100 != 0) || y1 % 400 == 0) {
                System.out.print(y1 + ' ');
            }
        }
    }
}
