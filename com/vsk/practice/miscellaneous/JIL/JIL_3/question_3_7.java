package com.vsk.practice.miscellaneous.JIL.JIL_3;

public class question_3_7 {
        public static void main(String[] args) {
            String s = "abcdeeefghi";
            char x = 'e';
            int count = 0;
            for(int i = 0; i < s.length(); i++ ){
                if(s.charAt(i) == x){
                    count++;
                }
            }
            System.out.println(count);
        }
    }

