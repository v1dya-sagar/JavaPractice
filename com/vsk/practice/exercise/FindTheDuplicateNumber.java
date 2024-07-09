package com.vsk.practice.exercise;

import java.util.HashSet;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{1,2,3,2,4}));
    }
    public static int findDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return -1;  // Just to satisfy the compiler, this should never be reached
    }
}
