package com.vsk.practice.exercise;

/**
 * created by : v1dya-sagar on 18-07-2024
 *
 * @author : v1dya-sagar
 * @date : 18-07-2024
 * @project : JavaPractice
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int leftMultiplier = 1, rightMultiplier = 1;
        int[] result = new int[nums.length];

        for(int i = nums.length - 1; i >= 0; i--){
            result[i] = rightMultiplier;
            rightMultiplier *= nums[i];

        }
        for(int i = 0; i < nums.length; i++){
            result[i] *= leftMultiplier;
            leftMultiplier *= nums[i];

        }
        return result;
    }
}
