package com.vsk.practice.exercise;

public class SubArrayWithLargestSum {
    public static void main(String[] args) {
        int[] givenArray = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; // op : {4, -1, 2, 1}
//        int[] givenArray = {5, 4, -1, 7, 8};
        int maxSum = Integer.MIN_VALUE, currentSum = 0, start = 0, end = 0;
        for (int i = 0; i < givenArray.length; i++) {
            currentSum += givenArray[i];
            if(currentSum < 0){

                currentSum = 0;
            }
            if(maxSum < currentSum){

                maxSum = currentSum;
                start = i;
            }
            end = i;
        }
        System.out.println(maxSum);

        if (end != 0){
            for(int j = start; j <= end; j++ ){
                System.out.print(givenArray[j] + " ");
            }
        }
    }
}
