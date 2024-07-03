package com.vsk.practice.miscellaneous.pattern_problems;

public class SimplePyramidPattern {
//    Input Format: N = 3
//    Result:
//            *
//            ***
//            *****
    //        Input Format: N = 6
//        Result:
//     *
//    ***
//   *****
//  *******
// *********
//***********
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for(int space = 1; space <= n - i; space++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
