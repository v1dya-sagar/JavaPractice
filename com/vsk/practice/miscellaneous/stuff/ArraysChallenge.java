package com.vsk.practice.miscellaneous.stuff;

import java.util.Arrays;

import java.util.Scanner;

public class ArraysChallenge {
    public static void main(String[] args) {
        int[] a = getIntegers(10);
        a = sortIntegers(a);
        printArray(a);
    }

    public static int[] getIntegers(int n) {
        int[] array = new int[n];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int[] sortIntegers(int[] array) {
        Arrays.sort(array);
        int n = array.length;
        for(int i = 0 ; i < n/2; i++){
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}




