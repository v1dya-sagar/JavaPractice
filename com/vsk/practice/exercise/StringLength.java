package com.vsk.practice.exercise;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        String a = "",str;
        for(int i = 1; i<=n; i++){
            str = Integer.toString(i);
            a = a.concat(str);
        }
        System.out.println(a);
        System.out.println("Length = " + a.length());
    }
}
