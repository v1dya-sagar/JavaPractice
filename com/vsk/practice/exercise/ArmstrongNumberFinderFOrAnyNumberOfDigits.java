package com.vsk.practice.exercise;

import java.util.Scanner;

public class ArmstrongNumberFinderFOrAnyNumberOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for(int i = 0 ; i < 90 ; i++) {
            System.out.print("Enter a number : ");
            int num = scan.nextInt();
            int digits = countDig(num);
            int sum = 0, temp = num;
            while (num != 0) {
                int rem = num % 10;
                sum += Math.pow(rem, digits);
                num /= 10;
            }
            if (temp == sum) {
                System.out.println("It is an Armstrong Number ");
            } else {
                System.out.println("It is not an Armstrong Number");
            }
        }
    }
    public static int countDig(int n)
    {
        int count = 0;
        while(n != 0)
        {
            n = n / 10;
            count = count + 1;
        }
        return count;
    }
}
