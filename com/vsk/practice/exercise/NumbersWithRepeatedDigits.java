package com.vsk.practice.exercise;

public class NumbersWithRepeatedDigits {
    public static void main(String[] args) {
        int n = 102 , count = 0;
        for(int i = 1; i <= n; i++){
            String s = String.valueOf(i);
            for(int j = 0; j < s.length() - 1; j++){
                if(s.charAt(j) == s.charAt(j+1)){
                    count++;
                    System.out.println(i);
                }
            }
        }
        System.out.println("count  = " + count);
    }
}
