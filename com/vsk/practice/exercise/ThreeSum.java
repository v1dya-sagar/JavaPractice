package com.vsk.practice.exercise;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] givenArray = {-1, 0, 1, 2, -1, -4};
        Set<List<Integer>> answer = new HashSet<>();
        for (int i = 0; i < givenArray.length; i++) {
            Set<Integer> middleElements = new HashSet<>();
            for(int j = i+1; j < givenArray.length; j++){
                int thirdValue = -(givenArray[i] + givenArray[j]);
                if(middleElements.contains(thirdValue)){
                    List<Integer> temp =  Arrays.asList(givenArray[i], givenArray[j], thirdValue);
                    temp.sort(null);
                    answer.add(temp);
                }
                middleElements.add(givenArray[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(answer);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}
