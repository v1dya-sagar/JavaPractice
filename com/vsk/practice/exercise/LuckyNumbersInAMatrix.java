package com.vsk.practice.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * created by : v1dya-sagar on 19-07-2024
 *
 * @author : v1dya-sagar
 * @date : 19-07-2024
 * @project : JavaPractice
 */
public class LuckyNumbersInAMatrix {
    public List<Integer> luckyNumbers (int[][] matrix) {


        List<Integer> result = new ArrayList<>();

        if(matrix.length == 0){
            return result;
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(isMinAndMax(matrix, i, j) ){
                    result.add(matrix[i][j]);
                }
            }
        }


        return result;
    }

    boolean isMinAndMax(int[][] matrix, int row, int col){
        int element = matrix[row][col];

        // check min for row
        for(int i = 0; i < matrix[row].length; i++){
            if(element > matrix[row][i]){
                return false;
            }
        }


        // check max for column
        for(int j = 0; j < matrix.length; j++){
            if(element < matrix[j][col]){
                return false;
            }
        }
        return true;

    }
}
