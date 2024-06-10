package com.vsk.practice.exercise;

import java.util.Arrays;

class HeightChecker {
    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{1,2,3,2,4,1}));
    }
    public static int heightChecker(int[] heights) {
        final int[]  ordered = Arrays.copyOf(heights, heights.length);
        Arrays.sort(ordered);

        int outOfOrder = 0;
        for (int i = 0; i < ordered.length; i++) {
            if (ordered[i] != heights[i])
                outOfOrder++;
        }

        return outOfOrder;
    }
}