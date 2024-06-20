package com.vsk.practice.miscellaneous.JIL.JIL_2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class question_2_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements in the array : ");
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<a.length; i++){
            System.out.print("Enter element "+(i+1)+" : ");
            a[i] = scan.nextInt();
        }
        System.out.print("Enter element to insert : ");
        int newElement = scan.nextInt();
        int[] b = new int[n+1];
        for(int j = 0; j< a.length; j++){
            b[j] = a[j];
        }
        b[n] = newElement;
        System.out.print("printing new array with inserted element :");
        System.out.print(Arrays.toString(b));
    }
}
