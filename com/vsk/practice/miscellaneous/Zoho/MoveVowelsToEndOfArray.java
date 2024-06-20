package com.vsk.practice.miscellaneous.Zoho;

import java.util.Arrays;

public class MoveVowelsToEndOfArray {
    public static void main(String[] args) {
        String[] arr = {"h", "e", "d", "f", "t", "u", "i", "e", "r", "o"};
        int j = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(!isVowel(arr[i])){
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static boolean isVowel(String l){
        if(l.equals("a") || l.equals("e") || l.equals("i") || l.equals("o") || l.equals("u")){
            return true;
        }
        return false;
    }
}
