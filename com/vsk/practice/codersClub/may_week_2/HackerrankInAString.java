package com.vsk.practice.codersClub.may_week_2;

public class HackerrankInAString {
    public static void main(String[] args) {
        System.out.println(hackerrankInString("abcdhackerrankabcd"));
    }
    public static String hackerrankInString(String s) {
        // Write your code here
        String str = "hackerrank";
        if (s.length() < str.length()) {
            return "NO";
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < str.length() && s.charAt(i) == str.charAt(j)) {
                j++;
            }
        }
        return (j == str.length() ? "YES" : "NO");

    }
}
