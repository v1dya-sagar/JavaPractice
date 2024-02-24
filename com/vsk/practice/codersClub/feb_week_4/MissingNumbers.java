package com.vsk.practice.codersClub.feb_week_4;

import java.util.Arrays;
import java.util.HashMap;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] brr = {7, 2, 5, 4, 6, 3, 5, 3};
        int[] arr = {7, 2, 5, 3, 5, 3};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num : brr){
            int freq = hm.getOrDefault(num, 0);
            freq++;
            hm.put(num, freq);
        }
        for(int transferNum : arr){
            int freq = hm.get(transferNum);
            freq--;
            if(freq == 0){
                hm.remove(transferNum);
            } else{
                hm.put(transferNum, freq);
            }
        }

        int[] result = new int[hm.size()];
        int i = 0;
        for (HashMap.Entry<Integer, Integer> integerIntegerEntry : hm.entrySet()) {
            result[i++] = integerIntegerEntry.getKey();
        }

        System.out.println(Arrays.toString(result));

    }
}
