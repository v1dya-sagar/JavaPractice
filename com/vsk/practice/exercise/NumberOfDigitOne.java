package com.vsk.practice.exercise;

public class NumberOfDigitOne {
    public static void main(String[] args) {
        int n = 14,count = 0;
        StringBuilder s = new StringBuilder();
        for(int i = 1; i <= n; i++){
            s.append(String.valueOf(i));
        }
        System.out.println(s);
        for(int j = 0 ; j < s.length(); j++){
            if(s.charAt(j) == '1'){
                count++;
            }
        }
        System.out.println(count);
    }
}
