package com.vsk.practice.miscellaneous.Zoho;

import java.util.HashMap;
import java.util.Map;

public class MinimumDistanceBetweenIdenticalPair {
    public static void main(String[] args) {
        int[] givenArr = {7, 1, 2, 2, 14, 9, 1, 7};
        int distance = 0, min = Integer.MAX_VALUE;
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < givenArr.length; i++ ){
            if(hm.containsKey(givenArr[i])){
                distance = i - hm.get(givenArr[i]);
                if(min > distance){
                    min = distance;
                }
            } else {
                hm.put(givenArr[i], i);
            }
        }

        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
    }
}
