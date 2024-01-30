package com.vsk.practice.codersClub.jan_week_4;

public class Encryption{

    public static void main(String[] args){
        encryption("haveaniceday");
    }
    public static void encryption(String s) {
        // Write your code here
        int len = s.length();
        double squareRoot = Math.sqrt(len);
        int columns = (int)Math.ceil(squareRoot);
        StringBuilder result = new StringBuilder();
        for(int j = 0;j<columns;j++){
            StringBuilder temp = new StringBuilder();
            for(int i = j;i<len;i+=columns){
                temp.append(s.charAt(i));
            }
            result.append(temp+" ");
        }
        System.out.println(result.toString());

    }
}