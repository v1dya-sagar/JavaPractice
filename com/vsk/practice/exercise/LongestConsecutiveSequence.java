package com.vsk.practice.exercise;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args){
        int[] a = {2000,4500,11,12,56,13,16,40,14,60,15};
        int index = 0;
        Arrays.sort(a);
        for(int i = 0; i < a.length; i++) {
            if(i == a.length-1){
                break;
            }
            int first = a[i], second = a[i+1];
            if(second == first + 1){
                System.out.println(first);
            }else {
                System.out.println(first);
                break;
            }
        }
    }
}
