package com.vsk.practice.exercise;

import java.util.ArrayList;
import java.util.Collections;


public class OddEvenArraySort {
    public static void main(String[] args) {
        int[] givenArray = {1, 2, 3, 4, 5, 7, 10};
        StringBuilder oddString = new StringBuilder();
        StringBuilder evenString = new StringBuilder();
        for (int i : givenArray) {
            if (i % 2 == 0) {
                evenString.append(i).append(" ");

            } else {
                oddString.append(i).append(" ");
            }
        }
        System.out.print(oddString.reverse() + " ");
        System.out.print(evenString);
    }
}


//    public static void main(String[] args) {
//        int[] givenArray = {1,2,3,4,5,7,10};
//        ArrayList<Integer> evenList = new ArrayList<>();
//        ArrayList<Integer> oddList = new ArrayList<>();
//        for(int i : givenArray){
//            if(i % 2 == 0) {
//                evenList.add(i);
//            } else {
//                oddList.add(i);
//            }
//        }
//        Collections.sort(evenList);
//        Collections.sort(oddList);
//        printOddList(oddList);
//        printEvenList(evenList);
//    }
//    public static void printEvenList(ArrayList<Integer> arrayList){
//        for (Integer integer : arrayList) {
//            System.out.print(integer + " ");
//        }
//    }
//    public static void printOddList(ArrayList<Integer> arrayList){
//        for(int i = arrayList.size() - 1; i >= 0 ; i--){
//            System.out.print(arrayList.get(i) + " ");
//        }
//    }
