package com.vsk.practice.exercise;

import java.util.Arrays;

public class ArrangeDigitsAscendingOrder {
    public static void main(String[] args) {
        int n = 654321, m = 0;
        char[] num = String.valueOf(n).toCharArray();
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            m += Character.getNumericValue(num[i]);
            m *= 10;
        }
        System.out.println(m/10);
    }
}
