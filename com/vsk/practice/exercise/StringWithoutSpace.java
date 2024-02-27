package com.vsk.practice.exercise;

import java.util.Scanner;

public class StringWithoutSpace {
    public static void main(String[] args) {
        //Your Code Here
        Scanner s = new Scanner(System.in);
        char[] a = s.nextLine().toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ' ')
                continue;
            System.out.print(a[i]);
        }
    }
}
