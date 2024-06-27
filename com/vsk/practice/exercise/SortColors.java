package com.vsk.practice.exercise;

import java.util.Arrays;

public class SortColors {
    // also known as Dutch national flag problem
    public static void main(String[] args) {
        int[] array = {2,0,2,1,1,0};
        sortColors(array);
        System.out.println(Arrays.toString(array));
    }
    public static void sortColors(int[] nums) {
        int zeroIndex = 0, twoIndex = nums.length - 1, i = 0;
        while( i <= twoIndex ) {
            if( nums[i] == 0 )
                swap(nums, zeroIndex++, i++);
            else if( nums[i] == 2)
                swap(nums, twoIndex--, i);
            else
                i++;
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
