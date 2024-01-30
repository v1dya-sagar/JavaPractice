package com.vsk.practice.exercise;

public class SubStringsWithOne {
    public static void main(String[] args) {
        String S = "10100101011";
        int count = 0;
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == '1')
                count++;
        }

        int res = count * (count - 1) / 2;
        System.out.println(res);
    }
}
