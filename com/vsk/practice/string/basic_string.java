package com.vsk.practice.string;

import java.util.Locale;

public class basic_string {
    public static void main(String[] args) {
        String s = "Java";
        String string = new String("Programming");
        String string2 = new String("Programming");
        if(string == string2){
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }
        System.out.println(s.length());
        System.out.println(s.equals(string));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s);
        char ch;
        ch = s.charAt(2);
        System.out.println(ch);
        String abc= "This is my Life";
        String name = "abcdoefghi ";

        boolean result = name.equalsIgnoreCase("bro");
        System.out.println(result);

        int result1 = name.length();
        System.out.println(result1);

        char result2 = name.charAt(0);
        System.out.println(result2);

        int result3 = name.indexOf("o");
        System.out.println(result3);

        boolean result4 = name.isEmpty();
        System.out.println(result4);

        String result5 = name.toUpperCase();
        System.out.println(result5);

        String result6 = name.toLowerCase();
        System.out.println(result6);

        String result7 = name.trim();
        System.out.println(result7);

        String result8 = name.replace('o', 'a');
        System.out.println(result8);
    }
}
