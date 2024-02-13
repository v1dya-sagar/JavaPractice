package com.vsk.practice.exercise;

public class BiggerThanNumber {
    public static void main(String[] args) {
        int[] givenArray = {8, 1, 4, 6, 9, 5};
        for (int j = 0; j < givenArray.length; j++) {
            int next = -1;
            if (j == givenArray.length - 1) {
                for (int i = givenArray.length - 2; i >= 0; i++) {
                    if (givenArray[i] > givenArray[j]) {
                        next = givenArray[i];
                        break;
                    }
                }
            }
                for (int i = j + 1; i < givenArray.length; i++) {
                    if (givenArray[i] > givenArray[j]) {
                        next = givenArray[i];
                        break;
                    }
                }
                System.out.println(givenArray[j] + " -> " + next);
            }
        }
    }