package com.vsk.practice.miscellaneous.Zoho;

import java.util.Scanner;

public class PrintOneToNZoho {

//    Print 1to N - Digits Count [ZOHO]
//    A positive integer N is passed as the input. If we print all the numbers from 1 to N continuously,
//    the program must find the number of characters(digits) C printed and print the count C as the output
//    Input Format:
//    The first line contains N.
//    Output Format:
//    The first line contains C.
//    Boundary Conditions:
//            1 <= N <= 9999999
//    Example Input/Output 1:
//    Input:
//            2
//    Output:
//            2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int c = 0;
        for(int i = n; i > 0; i--){
            if( i<=9) c++;
            if(i>=10 && i<=99) c+=2;
            if(i>=100 && i<=999) c+=3;
            if(i>=1000 && i<=9999) c+=4;
            if(i>=10000 && i <= 99999) c+=5;
            if(i>=100000 && i<= 999999) c+= 6;
            if(i>=1000000 && i<=9999999) c+=7;
        }
        System.out.println(c);

    }
}
