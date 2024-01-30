package com.vsk.practice.exercise;

public class TwoSum {
    public static void main(String[] args) {
        int[] givenArray = {2,7,11,15};
        int target = 9;
        for (int j = 0 ; j < givenArray.length ; j++){
            for(int i = j+1 ; i < givenArray.length ; i++){
                if(givenArray[i] + givenArray[j] == target){
                    System.out.println("[" + givenArray[j] + " at " + j + ", "
                            + givenArray[i] + " at " + i  + "]");
                }
            }
        }
    }
}
