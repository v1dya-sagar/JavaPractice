package com.vsk.practice.exercise;

/**
 * created by : v1dya-sagar on 20-07-2024
 *
 * @author : v1dya-sagar
 * @date : 20-07-2024
 * @project : JavaPractice
 */
public class MaximumProductOfThreeNumbers {
    public int maximumProduct(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;

        for(int num : nums){
            // encounter new highest
            if(num > max1){
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if(num > max2){
                max3 = max2;
                max2 = num;
            } else if(num > max3){
                max3 = num;
            }
            // encounter new lowest
            if(num < min1){
                min2 = min1;
                min1 = num;
            } else if(num < min2){
                min2 = num;
            }



        }
        return Math.max( min1*min2*max1 , max1*max2*max3 );

    }
}
