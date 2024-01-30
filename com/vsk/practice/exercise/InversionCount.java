package com.vsk.practice.exercise;

public class InversionCount {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 6};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] > a[j] && i < j) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
