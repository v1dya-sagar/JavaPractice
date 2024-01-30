package com.vsk.practice.exercise;

public class LastOccurrenceOfCharacter {
    public static void main(String[] args) {
        String s = "skillrack";
        int f = 2, count = 0;
        for (int i = 0; i < 9; i++) {
            count = 0;
            if(s.charAt(i) == ' '){
                continue;
            }
            for (int j = i; j < 9; j++) {
                if (s.contains(Character.toString(s.charAt(i)))) {
                    count++;
                    s.replace(s.charAt(i), ' ');
                }
            }
            if(count == f){
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}