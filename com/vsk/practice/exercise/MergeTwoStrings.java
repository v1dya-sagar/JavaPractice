package com.vsk.practice.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoStrings {
    public static void main(String[] args) {
        String s1 = "Hello", s2 = "hello";
        int n=0;
        if(s1.length()>s2.length()){
            n=s1.length();
        }
        else{
            n=s2.length();
        }

        String ans="";
        for(int i=0;i<n;i++){
            if(i<s1.length()){
                ans+=s1.charAt(i);
            }
            if(i<s2.length()){
                ans+=s2.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
