package com.vsk.practice.exercise;

public class MaximumSubArray {
    public static void main(String[] args) {

        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
    public static int maxSubArray(int[] givenArray) {
        int start = 0 , end =0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < givenArray.length; ++i) {
            int sum = givenArray[i];
            maxSum = Math.max(maxSum, sum);
            for (int j = i + 1; j < givenArray.length; ++j) {
                sum += givenArray[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}
