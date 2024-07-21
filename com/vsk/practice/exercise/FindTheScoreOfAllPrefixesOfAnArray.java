package com.vsk.practice.exercise;

/**
 * created by : v1dya-sagar on 20-07-2024
 *
 * @author : v1dya-sagar
 * @date : 20-07-2024
 * @project : JavaPractice
 */
public class FindTheScoreOfAllPrefixesOfAnArray {
    public long[] findPrefixScore(int[] nums) {
        long[] result = new long[nums.length];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(nums[i], max);
            result[i] = (long)(nums[i] + max + (i > 0  ? result[i - 1] : 0));
        }
        return result;
    }
}
