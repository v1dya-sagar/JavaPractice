package com.vsk.practice.exercise.daily;

import java.util.Arrays;
import java.util.Scanner;

public class SquareOrRectangle {
    public static void main(String[] args) {
        int[] points = new int[8];
        Scanner scan = new Scanner(System.in);
        for(int i = 0 ; i < 8 ; i++){
            points[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(points));

    }
}
