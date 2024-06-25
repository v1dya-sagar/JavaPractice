package com.vsk.practice.miscellaneous.Zoho;

import java.util.HashMap;
import java.util.Map;


// {1,2,3,1,2,3,3,1,1,4,5};




public class PairsOfSocks {
    public static void main(String[] args) {
        int[] givenArr = {1,2,3,4,5,1,1,1};
        int availablePairs = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i = 0 ; i < givenArr.length; i++){
            if(hm.containsKey(givenArr[i])){
                hm.put(givenArr[i], hm.get(givenArr[i]) + 1);
                if(hm.get(givenArr[i]) >= 2){
                    availablePairs++;
                    hm.put(givenArr[i], hm.get(givenArr[i]) - 2);
                }
            }
            else {
                hm.put(givenArr[i], 1);
            }
        }
        System.out.println(availablePairs);
    }
}
