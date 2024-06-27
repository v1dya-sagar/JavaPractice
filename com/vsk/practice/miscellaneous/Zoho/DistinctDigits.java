package com.vsk.practice.miscellaneous.Zoho;

import java.util.HashSet;
import java.util.Set;

public class DistinctDigits {
    public static Set<Character> findDistinctDigits(int[] nums) {
        // Set to hold unique digits
        Set<Character> uniqueDigits = new HashSet<>();

        // Iterate through each number in the array
        for (int num : nums) {
            // Convert the number to a string to access each digit
            String numStr = String.valueOf(num);
            // Add each digit to the set
            for (char digit : numStr.toCharArray()) {
                uniqueDigits.add(digit);
            }
        }

        return uniqueDigits;
    }

    public static void main(String[] args) {
        int[] nums = {123, 456, 789, 101};
        Set<Character> distinctDigits = findDistinctDigits(nums);
        System.out.println(distinctDigits);
    }
}