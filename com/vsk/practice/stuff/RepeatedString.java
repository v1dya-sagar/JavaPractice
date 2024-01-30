package com.vsk.practice.stuff;

public class RepeatedString {
    public static void main(String[] args) {
        String s = "abc";
        int n= 10;
        for(int i = 0; i<=n;i++){
            s += s;
        }
        int count =0;
        for(int j = 0; j<=n; j++){
            if(s.charAt(j) == 'a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
