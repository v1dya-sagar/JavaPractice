package com.vsk.practice.exercise;

public class FirstOccurrence {
    public static void main(String[] args) {
        String haystack = "leetcode", needle = "code";
        for(int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(0)){
                int indexNeedle = 1, indexHaystack = i+1;
                while(indexNeedle < needle.length() && indexHaystack < haystack.length() &&
                needle.charAt(indexNeedle) == haystack.charAt(indexHaystack)){
                    indexNeedle++;
                    indexHaystack++;
                    if(indexNeedle == needle.length()){
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }
}
