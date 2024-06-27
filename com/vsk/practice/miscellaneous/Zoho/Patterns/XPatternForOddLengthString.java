package com.vsk.practice.miscellaneous.Zoho.Patterns;

public class XPatternForOddLengthString {
    public static void main(String[] args) {
        String s = "geeks";
        for (int i = 0; i < s.length(); i++) {
            int j = s.length()-i-1;
            for(int k = 0 ; k < s.length(); k++){
                if(k == i || k == j){
                    System.out.print(s.charAt(k)); // print i for top down
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
