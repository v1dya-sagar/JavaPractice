package com.vsk.practice.miscellaneous.JIL.JIL_1_2;

import java.util.Scanner;

public class question__24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        int sum = 0 ,temp = num;
        while (num!=0){
            int rem = num%10;
            sum +=rem*rem*rem;
            num /= 10;
        }
        if (temp == sum){
            System.out.println("It is an Armstrong Number ");
        }else{
            System.out.println("It is not an Armstrong Number");
        }
    }
}
