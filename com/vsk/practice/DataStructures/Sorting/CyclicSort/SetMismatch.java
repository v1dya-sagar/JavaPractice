package com.vsk.practice.DataStructures.Sorting.CyclicSort;

/**
 * created by : v1dya-sagar on 17-07-2024
 *
 * @author : v1dya-sagar
 * @date : 17-07-2024
 * @project : JavaPractice
 */
// https://leetcode.com/problems/set-mismatch/
public class SetMismatch {
    public int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[] {arr[index], index+1};
            }
        }
        return new int[] {-1, -1};
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}