package com.vsk.practice.exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestSubArrayContainingLargestSum {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {100000,7000,-8,-8,-10,-20,-40,100,200,30000,-50,-11,2000,9000,0,-67,-54,-34,-4,-1,-5,-1};
        ArrayList<int[]> positiveArrays = new ArrayList<>();
        for(int i = 0; i < arrayOfNumbers.length; i++){
            if(arrayOfNumbers[i] > 0){
                for(int j = i+1 ; j < arrayOfNumbers.length; j++){
                    if(arrayOfNumbers[j] < 0){
                        if(i == 0){
                            positiveArrays.add((Arrays.copyOfRange(arrayOfNumbers,i,j)));
                        }
                        else if(j - i == 1){
                            i+=1;
                            continue;
                        }
                        positiveArrays.add((Arrays.copyOfRange(arrayOfNumbers,i+1,j)));
                        break;
                    }
                }
            }
        }
        int[] sumOfIndividualPositiveSubArrays = new int[positiveArrays.size()];
        int index = 0 ;
        for(int[] subArray : positiveArrays){
            for (int j : subArray) {
                sumOfIndividualPositiveSubArrays[index] += j;
            }
            index++;
        }

        int[] resultArray;
        resultArray = Arrays.copyOf(getMax(sumOfIndividualPositiveSubArrays),
                getMax(sumOfIndividualPositiveSubArrays).length);
        System.out.println("Largest consecutive positive sub array " + Arrays.toString(positiveArrays.get(resultArray[0])));
        System.out.println("Sum of largest Positive sub array "+ resultArray[1]);
    }

    public static int[] getMax(int[] sumArray){
        int max = Integer.MIN_VALUE;
        int[] resultArray = new int[2];
        for(int i = 0; i < sumArray.length; i++){
            if( sumArray[i] > max){
                max = sumArray[i];
                resultArray[0] = i;
            }
        }
        resultArray[1] = max;

        return resultArray;
    }
}