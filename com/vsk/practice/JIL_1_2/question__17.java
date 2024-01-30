package com.vsk.practice.JIL_1_2;

import java.util.Scanner;

public class question__17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num,p = 1;
        System.out.print("Enter number : ");
        num = scanner.nextInt();
        int last = num%10;
        int copy = num;
        while (copy>=10){
            copy/=10;
            p *=10;
        }
        num -= p;
        System.out.println("Swapped Number : " + last + num/10 + copy);

    }
}
