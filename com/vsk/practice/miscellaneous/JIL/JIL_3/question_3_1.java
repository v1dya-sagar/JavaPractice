package com.vsk.practice.miscellaneous.JIL.JIL_3;

public class question_3_1 {
    public static void main(String[] args) {
//        55555
//        54444
//        54333
//        54322
//        54321

        for (int i = 5; i > 0; i--)
        {
            for (int j = 5; j > i; j--) {
                System.out.print(j);
            }
            for (int j = i; j > 0; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
