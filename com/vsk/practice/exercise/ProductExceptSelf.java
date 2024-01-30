package com.vsk.practice.exercise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int product = 1;
        for (int j : a) {
            product = 1;
            for (int k : a) {
                if (j == k) {
                    continue;
                } else {
                    product = product * k;
                }
            }
            System.out.println(product);
        }
    }
}
