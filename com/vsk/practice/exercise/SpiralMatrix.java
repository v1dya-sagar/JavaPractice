package com.vsk.practice.exercise;

import java.util.Scanner;
public class SpiralMatrix {

    public static void spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int rowStart = 0, rowEnd = m - 1;
        int colStart = 0, colEnd = n - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i++) {
                System.out.print(matrix[rowStart][i] + " ");
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.print(matrix[i][colEnd] + " ");
            }
            colEnd--;

            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    System.out.print(matrix[rowEnd][i] + " ");
                }
                rowEnd--;
            }

            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    System.out.print(matrix[i][colStart] + " ");
                }
                colStart++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        spiralOrder(matrix);
    }
}
