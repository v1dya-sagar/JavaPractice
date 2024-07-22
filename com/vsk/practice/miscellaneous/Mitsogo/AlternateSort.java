package com.vsk.practice.miscellaneous.Mitsogo;

import java.util.Arrays;

/**
 * created by : v1dya-sagar on 22-07-2024
 *
 * @author : v1dya-sagar
 * @date : 22-07-2024
 * @project : JavaPractice
 */
public class AlternateSort {
    public static void main(String[] args) {
        // assume only positive elements, duplicates for input case
        // ip
        // 1, 5, 8, 6, 4, 7, 2, 3
        // op
        // 8, 1, 7, 2, 6, 3, 5, 4
        int[] givenArray = {5, 1, 6, 4, 7, 2, 3};

        System.out.println(Arrays.toString(alternateSort(givenArray)));
    }

    private static int[] alternateSort(int[] givenArray) {
        int[] resultArray = new int[givenArray.length];
        for (int i = 0; i < givenArray.length - 1; i += 2) {
            int currentMax = getMax(givenArray);
            int currentMin = getMin(givenArray);
            resultArray[i] = currentMax;
            resultArray[i+1] = currentMin;
        }
        return givenArray.length % 2 == 1 ?
                Arrays.copyOf(resultArray, resultArray.length-1)
                : resultArray;
    }

    public static int getMin(int[] givenArray){
        int min = Integer.MAX_VALUE, minIndex = 0;
        for (int i = 0; i < givenArray.length ; i++) {
            if (givenArray[i] == -1) {
                continue;
            }
            if (givenArray[i] < min) {
                min = givenArray[i];
                minIndex = i;
            }
        }
        givenArray[minIndex] = -1;
        return min;

    }
    public static int getMax(int[] givenArray){
        int max = Integer.MIN_VALUE, maxIndex = 0;
        for (int i = 0; i < givenArray.length ; i++) {
            if (givenArray[i] == -1) {
                continue;
            }
            if (givenArray[i] > max) {
                max = givenArray[i];
                maxIndex = i;
            }
        }
        givenArray[maxIndex] = -1;
        return max;
    }
}
