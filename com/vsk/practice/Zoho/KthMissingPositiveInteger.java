package com.vsk.practice.Zoho;

public class KthMissingPositiveInteger {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr,k));

//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] <= k){
//                k++;
//            } else {
//                break;
//            }
//        }
//        System.out.println(k);

    }
    public static int findKthPositive(int[] arr, int k) {
        for(int i : arr){
            if(i <= k) k++; else break;
        }
        return k;
    }
    public static int BinarySearchFindKthPositive(int[] arr, int k) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] - mid - 1 < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left + k;
    }
}
