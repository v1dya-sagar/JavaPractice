package com.vsk.practice.exercise;

public class SwapCouplesInString {
    public static void main(String[] args) {
        String s = "venkatesh";
        for(int i = 0; i < s.length(); i+=2){
            if(i == s.length() - 1){
                System.out.print(s.charAt(i));
                break;
            }
            System.out.print(s.charAt(i+1));
            System.out.print(s.charAt(i));
        }
    }
}
