package com.vsk.practice.exercise;

public class StepNumber {
    public static void main(String[] args) {
        int n = 123456,flag = 0;
        String s = Integer.toString(n);
        for(int i = 0; i<s.length(); i++){
            if(i == s.length()-1){
                int a = Character.getNumericValue(s.charAt(i));
                int a1 = Character.getNumericValue(s.charAt(i-1));
                if( a1 == a - 1){
                    flag = 1;
                }
            }
            else {
                int a = Character.getNumericValue(s.charAt(i));
                int a1 = Character.getNumericValue(s.charAt(i+1));
                if (a == a1 - 1) {
                    flag = 1;
                } else if (a == a1 + 1) {
                    flag = 1;
                } else {
                    flag = 0;
                    break;
                }
            }
        }
        if(flag == 0){
            System.out.println("no");
        }
        else{
            System.out.println("yes");
        }
    }
}
