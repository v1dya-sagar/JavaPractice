package com.vsk.practice.miscellaneous.JIL.JIL_2;

import java.util.Scanner;

public class question_2_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements in the array : ");
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<a.length; i++){
            System.out.print("Enter element "+(i+1)+" : ");
            a[i] = scan.nextInt();
        }
        int[] b = new int[n];
        for(int x=0; x< a.length; x++){
            b[x] = a[x];
        }
        System.out.println("printing new array => b");
        for(int y = 0; y< b.length; y++){
            System.out.print(b[y] + " ");
        }
    }
}
