package com.vsk.practice.codersClub.jan_week_1;

import java.util.Arrays;

public class CircularArrayRotation {
    public static void main(String[] args) {
        int[] a = {3,4,5};
        int k = 2;
        k = k % a.length;
        int pivot = a.length - k;
        int[] newArray = new int[a.length];
        int newIndex = 0;
        for (int i = pivot; i < a.length; i++) {
            newArray[newIndex++] = a[i];
        }
        for (int i = 0; i < pivot; i++) {
            newArray[newIndex++] = a[i];
        }


        System.out.println(Arrays.toString(newArray));
    }
}
