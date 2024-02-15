package com.vsk.practice.daily;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {
    public static void main(String[] args) {
        //older logic
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        int rotations = 2; // Number of positions to rotate left

        ArrayList<Integer> rotatedArrayList = leftRotateArrayList(arrayList, rotations);
        System.out.println("Original ArrayList: " + arrayList);
        System.out.println("Left-Rotated ArrayList: " + rotatedArrayList);
    }

    public static ArrayList<Integer> leftRotateArrayList(ArrayList<Integer> list, int positions) {
        int n = list.size();
        ArrayList<Integer> rotatedList = new ArrayList<>(n);

        // Perform left rotation
        for (int i = 0; i < n; i++) {
            int newPosition = (i - positions + n) % n;
            rotatedList.add(list.get(newPosition));
        }

        return rotatedList;
    }
}
