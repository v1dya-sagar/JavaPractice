package com.vsk.practice.exercise;

import java.util.Scanner;

public class PermutationOfString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        Permutations(str, "");

    }

    public static void Permutations(String q, String ans) {
        if (q.length() == 0){
            System.out.println(ans);
            return;

        }

        for (int i = 0; i < q.length(); i++) {
            char ch = q.charAt(i);
            String left = q.substring(0, i);
            String right = q.substring(i + 1);
            String remainder = left + right;
            Permutations(remainder, ans + ch);

        }
    }
}
