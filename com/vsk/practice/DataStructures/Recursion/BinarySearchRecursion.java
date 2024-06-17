package com.vsk.practice.DataStructures.Recursion;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,9,10};
        int target = 11;
        System.out.println(binarySearch(arr, target, 0, arr.length - 1));
    }
    public static int binarySearch(int[] arr,int target, int start, int end){
        int mid = start + (end - start) / 2;
        if(start > end){
            return -1;
        }
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] < target){
            return binarySearch(arr,target,mid + 1,end);
        }
        return binarySearch(arr,target,start,mid - 1);
    }
}
