package com.vsk.practice.daily;

import java.util.Arrays;

public class UppercaseElements {
    public static void main(String[] args) {
        char[] charArray = {'a','B','d','C'};
        for(int i = 0 ; i < charArray.length ; i++){
            if (Character.isUpperCase(charArray[i])){
                System.out.println(charArray[i]);
            }
        }
    }
}
