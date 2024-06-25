package com.vsk.practice.exercise;

import java.util.HashSet;
import java.util.Set;

public class CountingElements {
    public static void main(String[] args) {
        int[] givenArr = {1,2,3,4};
        int count = 0;// op : 3
        Set<Integer> mySet = new HashSet<>();
        for(int i : givenArr){
            mySet.add(i);
        }
        for(Integer n : mySet){
            if(mySet.contains(n+1)){
                count++;
            }
        }
        System.out.println(count);
    }
}
