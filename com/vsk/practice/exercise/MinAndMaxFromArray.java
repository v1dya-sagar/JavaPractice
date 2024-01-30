package com.vsk.practice.exercise;

public class MinAndMaxFromArray {
    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6,7,8};
        int min = a[0], max = a[0];
        for(int i  = 0; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
