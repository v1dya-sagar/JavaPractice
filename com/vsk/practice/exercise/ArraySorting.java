package com.vsk.practice.exercise;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] inputArray = {35, 10, 55, 30, 25, 60, 20, 45, 15, 50};
        int[] sortedArray = sortArray(inputArray);

        System.out.println("Input Array: " + Arrays.toString(inputArray));
        System.out.println("Output Array: " + Arrays.toString(sortedArray));
    }

    public static int[] sortArray(int[] inputArray) {
        int[] sortedArray = new int[inputArray.length];
        boolean[] used = new boolean[inputArray.length];

        for (int i = 0; i < sortedArray.length; i++) {
            if (i % 2 == 0) {
                int maxIndex = getMaxIndex(inputArray, used);
                sortedArray[i] = inputArray[maxIndex];
                used[maxIndex] = true;
            } else {
                int minIndex = getMinIndex(inputArray, used);
                sortedArray[i] = inputArray[minIndex];
                used[minIndex] = true;
            }
        }

        return sortedArray;
    }

    public static int getMaxIndex(int[] array, boolean[] used) {
        int maxIndex = -1;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (!used[i] && array[i] > maxValue) {
                maxIndex = i;
                maxValue = array[i];
            }
        }

        return maxIndex;
    }

    public static int getMinIndex(int[] array, boolean[] used) {
        int minIndex = -1;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (!used[i] && array[i] < minValue) {
                minIndex = i;
                minValue = array[i];
            }
        }

        return minIndex;
    }
}


//package com.vsk.practice.exercise;
//
//import java.util.Arrays;
//
//public class ArraySorting {
//    public static void main(String[] args) {
//        int[] inputArray = {35, 10, 55, 30, 25, 60, 20, 45, 15, 50};
//        int[] sortedArray = sortArray(inputArray);
//
//        System.out.println("Input Array: " + Arrays.toString(inputArray));
//        System.out.println("Output Array: " + Arrays.toString(sortedArray));
//    }
//
//    public static int[] sortArray(int[] inputArray) {
//        int[] sortedArray = new int[inputArray.length];
//        int[] tempArray = Arrays.copyOf(inputArray, inputArray.length);
//
//        for (int i = 0; i < sortedArray.length; i++) {
//            if (i % 2 == 0) {
//                int maxIndex = getMaxIndex(tempArray);
//                sortedArray[i] = tempArray[maxIndex];
//                tempArray[maxIndex] = Integer.MIN_VALUE;
//            } else {
//                int minIndex = getMinIndex(tempArray);
//                sortedArray[i] = tempArray[minIndex];
//                tempArray[minIndex] = Integer.MAX_VALUE;
//            }
//        }
//
//        return sortedArray;
//    }
//
//    public static int getMaxIndex(int[] array) {
//        int maxIndex = 0;
//        int maxValue = Integer.MIN_VALUE;
//
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > maxValue) {
//                maxIndex = i;
//                maxValue = array[i];
//            }
//        }
//
//        return maxIndex;
//    }
//
//    public static int getMinIndex(int[] array) {
//        int minIndex = 0;
//        int minValue = Integer.MAX_VALUE;
//
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < minValue) {
//                minIndex = i;
//                minValue = array[i];
//            }
//        }
//
//        return minIndex;
//    }
//}
