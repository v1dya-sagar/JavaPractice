package com.vsk.practice.DataStructures.Recursion;

import java.util.Arrays;

public class ReverseArrayElements {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        reverseArrayElements(array,0);
        System.out.println(Arrays.toString(array));
    }

    public static void reverseArrayElements(int[] array, int start) {
        if(start > array.length - start - 1) {
            return;
        }
        reverseArrayElements(array, start +1);
        swap(array, start, array.length - start - 1);
    }
    public static void swap(int[] array, int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
