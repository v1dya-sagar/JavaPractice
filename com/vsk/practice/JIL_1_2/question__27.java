package com.vsk.practice.JIL_1_2;

public class question__27 {
    public static void main(String[] args) {
        int rows = 6, coeff = 1;

        for(int i=0; i<rows; i++){
            for(int space = i; space<rows; space++){
                System.out.print("  ");
            }

            for(int j=0; j<=i; j++){
                if( j== 0 || i == 0){
                    coeff = 1;
                }
                else{
                    coeff = coeff * (i - j + 1) / j;
                }

                System.out.printf("%4d", coeff);
            }

            System.out.println();
        }
    }
}
