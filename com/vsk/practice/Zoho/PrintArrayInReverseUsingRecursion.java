package com.vsk.practice.Zoho;

public class PrintArrayInReverseUsingRecursion {
    public static void main(String[] args) {
        String[] Arr = {"one", "two", "three"};
        printArray(Arr,Arr.length - 1);
    }
    public static void printArray(String[] givenArray, int position){
        if(position < 0) {
            return;
        }
        System.out.println(givenArray[position]);
        printArray(givenArray,position-1);
    }
}
