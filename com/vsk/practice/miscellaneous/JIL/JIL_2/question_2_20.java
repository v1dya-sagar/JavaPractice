package com.vsk.practice.miscellaneous.JIL.JIL_2;

import java.util.Scanner;

public class question_2_20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements in the array : ");
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<a.length; i++){
            System.out.print("Enter element "+(i+1)+" : ");
            a[i] = scan.nextInt();
        }
        System.out.print("Enter element to be searched : ");
        int e = scan.nextInt();
        for(int j = 0; j < a.length; j++){
            if(a[j] == e){
                System.out.println("element fount at " + j+1 + " position.");
            }
        }

    }
}
