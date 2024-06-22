package com.vsk.practice.exercise;

import java.util.Scanner;

public class DisariumNumber {
    // 175 = 1^1 + 7^2 + 5^3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int givenNumber = sc.nextInt();
        int backup = givenNumber;
        int sum = 0;
        // length of givenNumber
        int len = String.valueOf(givenNumber).length();

        while(givenNumber != 0){
            int digit = givenNumber % 10;
            sum += (int) Math.pow(digit,len);
            len--;
            givenNumber /= 10;
        }
        if(backup == sum) {
            System.out.println(backup + " is Disarium Number");
        } else {
            System.out.println(backup + " is not a Disarium Number");
        }
    }
}
