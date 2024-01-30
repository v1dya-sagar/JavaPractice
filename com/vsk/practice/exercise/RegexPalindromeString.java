package com.vsk.practice.exercise;


public class RegexPalindromeString {
    public static void main(String[] args) {
        String givenSentence = "A Man, a Plan, a Canal,:  Panama";
        StringBuilder resultString = new StringBuilder(givenSentence.replaceAll("[, :]", "").toLowerCase());
        StringBuilder reversedResult = resultString.reverse();
        if(reversedResult == resultString){
            System.out.println("yes it is a palindrome, " + reversedResult);
        }else {
            System.out.println("it is not panidrome, " + reversedResult);
        }
    }
}
