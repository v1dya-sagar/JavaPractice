package com.vsk.practice.exercise;

public class ReverseAlternateWordsInSentence {
    public static void main(String[] args) {
        System.out.println(reverseWord("My name is venkatesh"));

    }
    public static String reverseWord(String str){
        String[] words =str.split(" ");
        StringBuilder reverseWord= new StringBuilder();
        for(int i = 1; i < words.length; i+=2) {
                StringBuilder sb = new StringBuilder(words[i]);
                sb.reverse();
                reverseWord.append(words[i - 1]).append(" ");
                reverseWord.append(sb.toString()).append(" ");
        }
        return reverseWord.toString().trim();
    }
}
