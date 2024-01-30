package com.vsk.practice.exercise;

public class StringTrioValidMix {
    public static void main(String[] args) {
        String s1 = "mno";
        String s2 = "xyz";
        String s3 = "abcedf";
        int flag = 0;
        for(int i = 0 ; i< s1.length(); i++){
            if(!s3.contains(Character.toString(s1.charAt(i)))){
                flag = 1;
                break;
            }
        }
        for(int i = 0 ; i< s2.length(); i++){
            if(!s3.contains(Character.toString(s2.charAt(i)))){
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
