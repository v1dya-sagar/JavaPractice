package com.vsk.practice.exercise;

public class XthCharacterFromBothSides {
    public static void main(String[] args) {
        String S = "watermelon";
        int x = 3;
        System.out.print(S.charAt(x-1));
        System.out.println(S.charAt(S.length()-x));
    }
}
