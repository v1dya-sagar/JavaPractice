package com.vsk.practice.JIL_1_2;

import java.util.Scanner;

public class question__9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Enter a number : ");
        num = scanner.nextInt();
//        while (num >=1){
//            System.out.println(num);
//            num--;
//        }
//        for(int i = 1;num>=i;num--){
//            System.out.println(num);
//        }

        do{
            System.out.println(num);
            num--;
        }while (num >=1);
    }
}
