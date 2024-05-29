package com.vsk.practice.exercise;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        int[] givenArr = {1,2,3,2,4,5,5,6}; // sum = 1 + 3 + 4 + 6 , sum = 14
        int sum = 0;

        Map<Integer,Integer> map = new HashMap<>();

        for(int element : givenArr){
            if(!map.containsKey(element)){
                map.put(element,1);
            } else{
                map.put(element, map.get(element) + 1);
            }
        }

        for(int key : map.keySet()){
            if(map.get(key) == 1){
                sum += key;
            }
        }
        System.out.println(sum);
    }
}
