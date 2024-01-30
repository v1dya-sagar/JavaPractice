package com.vsk.practice.JIL_2;

import java.util.Arrays;
import java.util.Scanner;

public class question_2_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements in the array : ");
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<a.length; i++){
            System.out.print("Enter element "+(i+1)+" : ");
            a[i] = scan.nextInt();
        }
        int[] fr = new int[n];
        int visited = -1;
        for(int i = 0; i < a.length; i++){
            int count = 1;
            for(int j = i+1; j < a.length; j++){
                if(a[i] == a[j]){
                    count++;
                    fr[j] = visited;
                }
            }
            if(fr[i] != visited)
                fr[i] = count;
        }
        for(int i = 0; i < fr.length; i++){
            if(fr[i] != visited)
                System.out.println("Frequency of " + a[i] + " is :  " + fr[i]);
        }
        System.out.println(Arrays.toString(fr));
    }
}