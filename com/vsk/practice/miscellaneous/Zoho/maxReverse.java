package com.vsk.practice.miscellaneous.Zoho;

import java.util.Arrays;

public class maxReverse {
    public static void main(String[] args) {
        int input[]= {4,3,70,15,118};

        //finding max digits:

        int max_digits= getMaxDigits(input);
        System.out.println("Max Digit : "+max_digits);


        System.out.println("Result : "+ Arrays.toString(reverseArrayElements(input,max_digits)));
    }

    public static int[] reverseArrayElements(int[] input, int max_digits) {
        int index=0;
        for(int num:input)
        {
            int reverse=0;
            int multiplier = (int) Math.pow(10, max_digits - 1);
            while (num != 0) {
                reverse += (num % 10) * multiplier;
                num /= 10;
                multiplier /= 10;
            }
            input[index++] = reverse;


        }
        return input;
    }

    public static int getMaxDigits(int[] input) {
        int max = 0;
        for (int num : input) {
            int count = 0;
            while (num != 0) {
                num /= 10;
                count++;
            }

            max = Math.max(max, count);
        }
        return max;
    }
}


