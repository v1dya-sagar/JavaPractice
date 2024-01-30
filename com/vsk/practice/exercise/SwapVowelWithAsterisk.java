package com.vsk.practice.exercise;

public class SwapVowelWithAsterisk {
    public static void main(String[] args) {
        String s = "velammal", res = "",part = "";
        int count = 0;
        for(int j = 0 ; j <s.length(); j++){
            if(isVowel(s.charAt(j))){
                part = "";
                for(int x = 0 ; x <= count; x++){
                    part = part + "*";
                }
                count++;
                res = res + part;

            }else {
                res = res + s.charAt(j);
            }
        }
        System.out.println(res);
    }
    public static boolean isVowel(char c){
        char[] ar = {'a', 'e', 'i', 'o', 'u'};
        for (char value : ar) {
            if (value == c) {
                return true;
            }
        }
        return false;
    }
}
