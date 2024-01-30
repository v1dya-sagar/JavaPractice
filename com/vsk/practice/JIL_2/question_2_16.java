package com.vsk.practice.JIL_2;

import java.util.Scanner;

public class question_2_16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements in the array : ");
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<a.length; i++){
            System.out.print("Enter element "+(i+1)+" : ");
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++){
            int count = 0 ;
            for(int j = i+1; j < n; j++){
                if(a[i] == a[j]){
                    count++;
                }
            }
            System.out.println("Number of Duplicate elements of " + a[i] + " is " + count);
        }

    }
}
