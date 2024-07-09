package com.vsk.practice.exercise.LeetCodeDaily;

import java.util.Scanner;

public class GreaterThanPrevious {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = scanner.nextInt();
        }
        int large = a[0];
        System.out.print(large + " ");
        for(int i = 0; i < n; i++)
        {
            if(large < a[i])
            {
                large = a[i];
                System.out.print(a[i] + " ");
            }
        }
    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String inputLine = scanner.nextLine();
//        String[] numberStrings = inputLine.split(" ");
//        int[] numbers = new int[numberStrings.length];
//        for (int i = 0; i < numberStrings.length; i++) {
//            numbers[i] = Integer.parseInt(numberStrings[i]);
//        }
//
//        int max = Integer.MIN_VALUE;
//        for(int j = 0 ; j < numbers.length ; j++) {
//            if (numbers[j] > max) {
//                max = numbers[j];
//                System.out.println(max);
//            }
//        }
//
//    }
}
