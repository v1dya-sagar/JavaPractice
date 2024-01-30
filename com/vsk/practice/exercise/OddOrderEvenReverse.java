package com.vsk.practice.exercise;

public class OddOrderEvenReverse {
    public static void main(String[] args){
        String s = "venkatesh",s1 = "";
        for(int i = 0; i<s.length(); i+=2){
            s1 += s.charAt(i);
        }
        StringBuilder s2 = new StringBuilder();
        for(int i = 1; i <s.length(); i+=2){
            s2.append(s.charAt(i));
        }
        s2.reverse();
        for(int i = 0; i < s.length(); i++) {
            if (i >= s1.length()) {
                System.out.print(s2.charAt(i));
                continue;
            }
            if (i >= s2.length()) {
                System.out.print(s1.charAt(i));
                continue;
            }
                System.out.print(s1.charAt(i));
                System.out.print(s2.charAt(i));
            }
        }
 }

