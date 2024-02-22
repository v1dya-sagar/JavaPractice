package com.vsk.practice.exercise;

import java.util.*;
public class FindTheElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int left = 0, right = n -1, middle = 0;
        boolean flag = false;
        while(left < right){
            middle = left + right / 2;
            if(m < middle){
                right = middle - 1;
            } else if(m > middle){
                left = middle + 1;
            } else{
                flag = true;
            }
        }
        System.out.println(flag ? "yes" : "no");

    }
}
