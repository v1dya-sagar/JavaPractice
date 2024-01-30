package com.vsk.practice.exercise;

public class OddAndEvenIndexInString {
    public static void main(String[] args) {
        String s = "venkatesh";
        for(int i = 1; i <s.length(); i+=2)
            System.out.print(s.charAt(i));
        for(int i = 0; i <s.length(); i+=2)
            System.out.print(s.charAt(i));

    }
}
