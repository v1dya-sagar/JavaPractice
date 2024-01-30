package com.vsk.practice.exercise;

import java.util.ArrayList;

public class RemoveDuplicatesFromIntegerArray {
    public static void main(String[] args) {
        int[] input = {1, 1, 3, 7, 7, 8, 9, 9, 9, 10};
        int current = input[0];
        boolean found = false;
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int j : input) {
            if (current == j && !found) {
                found = true;
            } else if (current != j) {
                resultList.add(current);
                current = j;
                found = false;
            }
        }
        resultList.add(current);
        System.out.println(resultList);
    }
}
