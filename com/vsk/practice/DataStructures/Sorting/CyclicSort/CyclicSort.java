package com.vsk.practice.DataStructures.Sorting.CyclicSort;

import java.util.Arrays;

/**
 * created by : v1dya-sagar on 17-07-2024
 *
 * @author : v1dya-sagar
 * @date : 17-07-2024
 * @project : JavaPractice
 */
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
