package com.vsk.practice.exercise;

import java.util.ArrayList;
import java.util.Collections;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {1,2} , b = {3,4};
        ArrayList<Integer> newArray =  new ArrayList<>();
        for (int j : a) {
            newArray.add(j);
        }
        for (int i : b) {
            newArray.add(i);
        }
        Collections.sort(newArray);
        int size = newArray.size();

        double result = 0.0;
        if(newArray.size() % 2 == 0){
            result = ((double)newArray.get(size/2) + (double)newArray.get((size/2) - 1))/ 2;
        } else {
            result = newArray.get(size/2);
        }
        System.out.println(result);

    }
}
