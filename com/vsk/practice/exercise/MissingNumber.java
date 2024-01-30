package com.vsk.practice.exercise;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {0,1,3};
        int n = nums.length;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        System.out.println(total - sum);
    }
}
