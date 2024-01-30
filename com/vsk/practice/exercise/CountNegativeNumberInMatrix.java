package com.vsk.practice.exercise;

public class CountNegativeNumberInMatrix {
    public static void main(String[] args) {
        int[][] givenArray = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        int count = 0;
        for (int i = 0; i < givenArray.length; i++) {
            for (int j = 0; j < givenArray[i].length; j++) {
                if (givenArray[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("Number of Negative Elements : " + count);
    }
}
