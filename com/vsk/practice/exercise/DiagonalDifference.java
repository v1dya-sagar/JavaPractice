package com.vsk.practice.exercise;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size : ");
        int n = sc.nextInt();
        int[][] data = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                data[i][j] = sc.nextInt();
            }
        }
        int left = 0, right = 0;
        for(int x = 0; x < n; x++){
            left += data[x][x];
        }
        for(int y = 0; y < n; y++ ) {
                right += data[y][(n-1)-y];
        }
        System.out.println("left : " + left);
        System.out.println("right : " + right);
        int difference = right-left;
        if(difference < 0){
            System.out.println(difference * -1);
        }
        else {
            System.out.println(difference);
        }
    }
}
