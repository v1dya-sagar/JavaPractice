package com.vsk.practice.stuff;

import java.util.Scanner;

public class MinimumElementChallenge {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter number of integers : ");
        int count = sc.nextInt();
        sc.nextLine();
        int[] myArray = readIntegers(count);
        System.out.println("minimum Element is : " + findMin(myArray));
    }

    public static int[] readIntegers(int n){
        int[] array = new int[n];
        System.out.println("Enter " + n + " elements");
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array){
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}





