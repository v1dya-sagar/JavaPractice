package com.vsk.practice.Zoho;

public class ReplaceAllOccurenceOfGivenPatternToX {
    public static void main(String[] args) {
        String s = "GeeksForGeeks";
        String pattern = "Geeks";
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (i <= s.length() - pattern.length() && s.substring(i, i + pattern.length()).equals(pattern)) {
                sb.append("X");
                i += pattern.length();
            } else {
                sb.append(s.charAt(i));
                i++;
            }
        }
        System.out.println(sb);
    }
}
