package com.vsk.practice.DataStructures.Sorting.CyclicSort;

/**
 * created by : v1dya-sagar on 17-07-2024
 *
 * @author : v1dya-sagar
 * @date : 17-07-2024
 * @project : JavaPractice
 */
// https://leetcode.com/problems/missing-number/
// Amazon Question
class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }

        // case 2
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}