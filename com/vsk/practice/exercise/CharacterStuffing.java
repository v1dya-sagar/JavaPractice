package com.vsk.practice.exercise;

public class CharacterStuffing {
    public static void main(String[] args) {
        String s = "hsbfbasjfbabchskjhdksabc";
        System.out.println(s.replaceAll("abc" , "abcESC"));
        System.out.println(s);
        System.out.println(s.replaceAll("abcESC","abc" ));
    }
}
