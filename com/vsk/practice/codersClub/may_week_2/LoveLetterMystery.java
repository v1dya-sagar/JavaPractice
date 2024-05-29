package com.vsk.practice.codersClub.may_week_2;

public class LoveLetterMystery {
    public static void main(String[] args) {
        System.out.println(theLoveLetterMystery("abc"));
    }

    public static int theLoveLetterMystery(String word) {
        char[] charArray = word.toCharArray();
        int operationCount = 0;
        for(int i = 0; i < charArray.length/2; i++) {
            int leftAsciiValue = (int) charArray[i];
            int rightAsciiValue = (int) charArray[charArray.length-i-1];
            operationCount += Math.abs(rightAsciiValue - leftAsciiValue);

        }
        return operationCount;
    }
}
