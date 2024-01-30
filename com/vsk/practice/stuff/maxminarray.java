package com.vsk.practice.stuff;

import java.util.Arrays;
import java.util.Scanner;

public class maxminarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            int ele = scan.nextInt();
            ar[i] = ele;
        }
        Arrays.sort(ar);
        for(int i = 0; i < ar.length/2 ; i++){
            System.out.println(ar[n-1-i] + " " + ar[i]);
        }
        if(ar.length%2 != 0){
            System.out.println(ar[n/2] +  " " + "0");
        }
    }
}
