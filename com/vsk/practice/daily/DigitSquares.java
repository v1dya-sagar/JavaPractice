package com.vsk.practice.daily;

public class DigitSquares {
    public static void main(String[] args) {
        int number = 234;
        String s = String.valueOf(234);
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            int parseInt = Integer.parseInt(String.valueOf(s.charAt(i)));
            result.append((int) Math.pow(parseInt, 2));
        }
        System.out.println(result);
    }
}
