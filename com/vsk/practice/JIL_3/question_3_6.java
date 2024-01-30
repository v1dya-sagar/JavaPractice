package com.vsk.practice.JIL_3;

import java.util.Arrays;

public class question_3_6 {
    public static void main(String[] args) {
        String s = "abcdeeefghi";
        char x = 'e';
        for(int i = 0; i < s.length(); i++ ){
            if(s.charAt(i) == x){
                System.out.println("Character occurs at position : " + (i+1));
            }
        }
    }
}
