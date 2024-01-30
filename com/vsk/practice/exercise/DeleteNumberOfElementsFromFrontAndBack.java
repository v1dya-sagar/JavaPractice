package com.vsk.practice.exercise;

public class DeleteNumberOfElementsFromFrontAndBack {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        int n = 2;
        for(int i = n; i < a.length-n; i++){
            System.out.println(a[i]);
        }
    }
}
