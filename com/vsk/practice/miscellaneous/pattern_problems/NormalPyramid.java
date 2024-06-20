package com.vsk.practice.miscellaneous.pattern_problems;

import java.util.Scanner;

public class NormalPyramid {
        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            int n = s.nextInt();

            int stars = 0;


            for (int i = 0; i < n; i++) {
                if(stars <= 2 * n - 1) {
                    //spaces
                    for (int j = 0; j < i; j++)
                        System.out.print(" ");

                    //stars
                    for (int j = 0; j < stars; j++)
                        System.out.print("*");
                    stars += 2;

                    System.out.println();
                }

            }
        }
}
