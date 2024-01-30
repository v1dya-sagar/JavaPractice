package com.vsk.practice.exercise;

import java.util.Arrays;

public class MaximumLengthOfStrictlyIncreasingSubArray {
    public static void main(String[] args) {
        int count = 0;
        int[] a = {1,2,3,4,6,5,8,7,10,9} ;
        for(int i = 0 ; i < a.length-1 ; i++){
            if(a[i] > a[i+1]){
                for(int j = i; j < a.length-1; j++) {
                    a[j] = a[j + 1];
                }
                a = Arrays.copyOf(a, a.length - 1);
            }
        }
        System.out.println(a.length);
    }
}
