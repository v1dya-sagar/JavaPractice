package com.vsk.practice.exercise;

public class BiggerThanNumber {
    public static void main(String[] args) {
        int[] arrayOfElements = {8, 1, 4, 6, 9, 5};
        for (int j = 0; j < arrayOfElements.length; j++) {
            int next = -1;
            if (j == arrayOfElements.length - 1) {
                for (int i = arrayOfElements.length - 2; i >= 0; i++) {
                    if (arrayOfElements[i] > arrayOfElements[j]) {
                        next = arrayOfElements[i];
                        break;
                    }
                }
            }
                for (int i = j + 1; i < arrayOfElements.length; i++) {
                    if (arrayOfElements[i] > arrayOfElements[j]) {
                        next = arrayOfElements[i];
                        break;
                    }
                }
                System.out.println(arrayOfElements[j] + " -> " + next);
            }
        }
    }