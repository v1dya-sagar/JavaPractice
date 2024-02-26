package com.vsk.practice.exercise;

import java.util.Scanner;

public class PrintOneToNZoho {
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
