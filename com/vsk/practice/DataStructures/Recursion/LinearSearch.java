package com.vsk.practice.DataStructures.Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10,1,2,3,4,6,9,10};
        int target = 10;
        System.out.println(findIndex(arr,target,0));
        System.out.println(findIndexLast(arr,target,arr.length - 1 ));
    }
    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }

    static int findIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexLast(arr, target, index - 1);
        }
    }
}
