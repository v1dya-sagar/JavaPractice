package com.vsk.practice.exercise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurences {
    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1, 1, 2, 3, 3, 4, 4, 3, 4, 4, 2}));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        Set<Integer> s = new HashSet<>();
        for (int x : freq.values()) {
            s.add(x);
        }

        return freq.size() == s.size();
    }
}
