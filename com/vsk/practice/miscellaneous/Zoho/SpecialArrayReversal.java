package com.vsk.practice.miscellaneous.Zoho;

public class SpecialArrayReversal {
    public static void main(String[] args) {
        String s = "A&x#";
        char[] givenS = s.toCharArray();
        int i = 0, j = s.length()-1;
        while(i < j){
            if(Character.isAlphabetic(givenS[i]) && Character.isAlphabetic(givenS[j])){
                char temp = givenS[i];
                givenS[i] = givenS[j];
                givenS[j] = temp;
                i++;
                j--;
            }
            else if(!Character.isAlphabetic(givenS[i]))
                i++;
            else
                j--;
        }
        String Result = new String(givenS);
        System.out.println(Result);
    }
}
