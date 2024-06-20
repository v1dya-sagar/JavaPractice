package com.vsk.practice.miscellaneous.JIL.JIL_2;

import java.util.Scanner;

public class question_2_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of terms : ");
        int num = scan.nextInt();
        for(int j = 1; j<= num; j++){
            int sum =0;
            for(int i = 1; i<=j/2; i++){
                if(j%i == 0){
                    sum += i;
                }
            }
            if(sum == j){
                System.out.println(j + " ");
            }
        }

    }
}
