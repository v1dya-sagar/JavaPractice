package com.vsk.practice.exercise;

import java.util.Arrays;

public class BiggerThanNumberWithSort {
    public static void main(String[] args) {
        int[] a = {8,1,4,6,9,5};
        Arrays.sort(a);
        for(int element = 0 ; element < a.length ; element++) {
            if (element == a.length - 1) {
                System.out.println(a[element] + " -> ");
            } else {
                System.out.println(a[element] + " -> " + a[element + 1]);
            }
        }
    }
}
