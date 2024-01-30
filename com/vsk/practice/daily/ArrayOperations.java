package com.vsk.practice.daily;

import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        System.out.println(Arrays.toString(deleteElementAtPosition(array, 9)));
        int[] array2 = {1,2,3,3,4,5,5,6,7,7,8};
        returnUniqueElements(array2);
    }

//    public static int[] deleteElementAtPosition(int[] a, int position) {
//            for (int i = position; i < a.length - 1; i++) {
//                a[i] = a[i + 1];
//            }
//            return a = Arrays.copyOf(a, a.length - 1);
//        }
    public static void returnUniqueElements(int[] a){
        int n = a.length;
        for (int i = 0; i < n; i++)
        {
            int j;
            for (j = 0; j < i; j++)
                if (a[i] == a[j]) {
                    break;
                }
            if (i == j) {
                System.out.print(a[i] + " ");
            }
        }
    }
}

