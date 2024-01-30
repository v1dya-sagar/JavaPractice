package com.vsk.practice.JIL_1_2;

import java.util.Scanner;

public class question__25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        int temp = 0;
        for (int i = 1; i<=num/2; i++){
            if(num%i == 0){
                temp += i;
            }
        }
        System.out.println(temp);
        if(temp == num){
            System.out.println("It is a perfect Number ");
        }else{
            System.out.println("It is not a perfect number");
        }
    }
}
