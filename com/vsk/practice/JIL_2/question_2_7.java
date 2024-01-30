package com.vsk.practice.JIL_2;

import java.util.Scanner;

public class question_2_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements in the array : ");
        int n = scan.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("enter element " + (i+1) +" : ");
            ar[i] = scan.nextInt();
        }
        for(int j = 0; j< ar.length; j++){
            System.out.print(ar[j] + " ");
        }
        System.out.println();
        int sum = 0;
        for(int k = 0; k< ar.length; k++){
            sum += ar[k];
        }
        System.out.println("Sum of elements in the array is : " + sum);
    }
}
