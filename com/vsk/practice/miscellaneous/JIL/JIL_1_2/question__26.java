package com.vsk.practice.miscellaneous.JIL.JIL_1_2;

import java.util.Scanner;

public class question__26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of terms : ");
        int num = scan.nextInt();
        int n1 = 0,n2 =1,n3 = 0;
        System.out.println(n1);
        System.out.println(n2);
        for(int i =2; i<num;i++){
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
