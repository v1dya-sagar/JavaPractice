package com.vsk.practice.exercise;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "mrganaa";
       if(s1.length() == s2.length()){
           char[] c1 = s1.toCharArray();
           char[] c2 = s2.toCharArray();

           Arrays.sort(c1);
           Arrays.sort(c2);

           if(Arrays.equals(c1,c2)){
               System.out.println("Anagram");
           }
           else{
               System.out.println("not anagram");
           }
       }
    }
}
