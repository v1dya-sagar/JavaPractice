package com.vsk.practice.miscellaneous.JIL.JIL_2;

import java.util.Scanner;

public class question_2_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt(),sum = 0;
        for(int i=2; i<=num; i++){
            boolean flag = true;
            for(int j=2; j<=i/2;j++){
                if(i%j == 0){
                    flag = false;
                }
            }
            if(flag){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("The sum of prime numbers : " + sum);
    }
}
