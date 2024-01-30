package com.vsk.practice.exercise;

public class KthMissingNumber {
    public static void main(String[] args) {
        int[] givenArray = {2,3,4,7,11};
        int valueOfK = 5 , count = 0;
        int newSize = getMax(givenArray);
        int[] newArray = new int[newSize];
        for (int i = 1; i <= newSize; i++) {
            if(!elementIn(givenArray , i))
                newArray[count++] = i;
        }
        System.out.println(newArray[valueOfK-1]);
    }
    public static int getMax(int[] sumArray){
        int max = Integer.MIN_VALUE;
        for (int j : sumArray) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
    public static boolean elementIn(int[] array, int element){
        for (int i : array) {
            if (i == element) {
                return true;
            }
        }
        return false;
    }
}