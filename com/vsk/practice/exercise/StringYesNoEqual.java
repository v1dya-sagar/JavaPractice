package com.vsk.practice.exercise;

public class StringYesNoEqual {
    public static void main(String[] args) {
        String s = "nynnyy";
        int countOfN = 0 , countOfY = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'n'){
                countOfN++;
            }
            else{
                countOfY++;
            }
        }
        System.out.println(countOfY>countOfN?"YES":countOfY<countOfN?"NO":"EQUAL");
    }
}
