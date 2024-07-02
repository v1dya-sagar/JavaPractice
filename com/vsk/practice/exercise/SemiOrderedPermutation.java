package com.vsk.practice.exercise;

public class SemiOrderedPermutation {
    public static void main(String[] args) {
        System.out.println(semiOrderedPermutation(new int[]{4,3,2,1}));
    }
    public static int semiOrderedPermutation(int[] nums) {
        int oneIndex = -1, nIndex = -1;
        for(int  i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                oneIndex = i;
            }
            if(nums[i] == nums.length){
                nIndex = i;
            }
        }
        return  nums.length + oneIndex - nIndex  - (oneIndex > nIndex ? 2 : 1);
    }
}
