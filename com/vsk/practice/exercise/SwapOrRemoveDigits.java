package com.vsk.practice.exercise;

import java.util.Scanner;

public class SwapOrRemoveDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = scan.nextInt();
        String s = Integer.toString(n);
        String result = s.substring(0, s.length() -2);
        if(n % 2 == 0){
            System.out.println(result);
        }else{
            System.out.print(result);
            System.out.print(s.charAt(s.length()-1));
            System.out.println(s.charAt(s.length()-2));
        }
    }
}
