package com.vsk.practice.stuff;

public class Number {
    public static void main(String[] args) {
        int n = 1245;
        String s = Integer.toString(n);
        String result = s.substring(0,s.length()-2);
        //System.out.println(result);
        if(n % 2 == 1){
            System.out.print(result);
            System.out.print(s.charAt(s.length()-1));
            System.out.println(s.charAt(s.length()-2));
        }else {
            System.out.println(result);
        }
    }
}
