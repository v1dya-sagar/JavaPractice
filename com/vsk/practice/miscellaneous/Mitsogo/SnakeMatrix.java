package com.vsk.practice.miscellaneous.Mitsogo;

/**
 * created by : v1dya-sagar on 22-07-2024
 *
 * @author : v1dya-sagar
 * @date : 22-07-2024
 * @project : JavaPractice
 */
public class SnakeMatrix {
    public static void main(String[] args) {
        printMatrix(generateSnake(4));
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] +  " ");
            }
            System.out.println();
        }

    }

    public static int[][] generateSnake(int rows){
        int value = 0;
        int[][] matrix = new int[rows][rows];

        for(int i = 0; i < rows; i++){
            if(i%2 == 0){
                for (int j = 0; j < rows; j++) {
                    matrix[i][j] = ++value;
                }
            } else {
                for (int j = rows - 1; j >= 0; j--) {
                    matrix[i][j] = ++value;
                }
            }
        }
        return matrix;
    }
}
