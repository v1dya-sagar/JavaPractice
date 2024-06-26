package com.vsk.practice.DataStructures.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {4,2,3,1,5};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        // swap max with last index
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
