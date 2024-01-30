package com.vsk.practice.JIL_2;

import java.util.Scanner;

public class question_2_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements in the array : ");
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<a.length; i++){
            System.out.print("Enter element "+(i+1)+" : ");
            a[i] = scan.nextInt();
        }
        int temp;
        for(int b = 0; b< a.length; b++){
            for (int c = b+1; c < a.length; c++){
                if(a[b] > a[c]){
                    temp = a[b];
                    a[b] = a[c];
                    a[c] = temp;
                }
            }
        }
        System.out.println("second max element is : " + a[n-2]);
    }
}

