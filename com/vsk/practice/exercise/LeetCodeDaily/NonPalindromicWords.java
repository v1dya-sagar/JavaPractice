package com.vsk.practice.exercise.LeetCodeDaily;

import java.util.Arrays;

public class NonPalindromicWords {
    public static void main(String[] args) {
        String sentence = "Malayalam is eze to travel in a racecar";
        String[] words = sentence.split("\\s");
        System.out.println(Arrays.toString(words));
        for(String word : words){
            StringBuilder reversed = new StringBuilder(word);
            String temp = new String(reversed.reverse());
            if(!temp.equals(word)) {
                System.out.print(word + " ");
            }

        }
    }
}
