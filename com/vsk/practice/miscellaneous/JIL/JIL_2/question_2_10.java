package com.vsk.practice.miscellaneous.JIL.JIL_2;

import java.util.Scanner;

public class question_2_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements in the array : ");
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<a.length; i++){
            System.out.print("Enter element "+(i+1)+" : ");
            a[i] = scan.nextInt();
        }
        int negativeCount =0;
        for(int j=0; j<a.length; j++){
            if(a[j]<0){
                negativeCount++;
            }
        }
        System.out.println("Number of Negative Elements : " + negativeCount);
    }
}
