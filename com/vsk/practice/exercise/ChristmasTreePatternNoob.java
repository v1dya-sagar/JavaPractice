package com.vsk.practice.exercise;

public class ChristmasTreePatternNoob {

        public static void main(String[] args) {
            int height = 5; // Height of the tree
            printChristmasTree(height);
        }

        // Method to print the Christmas tree pattern
        public static void printChristmasTree(int height) {
            // Print the tree body
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < height - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2 * i + 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // Print the tree trunk
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < height - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }

}
