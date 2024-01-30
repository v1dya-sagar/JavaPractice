package com.vsk.practice.exercise;

public class CharacterCount {
    public static void main(String[] args) {
        String s = "vidyasagar",value = "";
        int count = 0, index = 0;
        char[] a = new char[s.length()];
        for(int i  = 0; i < s.length(); i++){
            count = 0 ;
            if(!InArray(a,s.charAt(i))) {
                count++;
                for (int x = i + 1; x < s.length(); x++) {
                    if (s.charAt(i) == s.charAt(x)) {
                        count++;
                    }
                }
                System.out.print(s.charAt(i));
                System.out.println(count);
                a[index] = s.charAt(i);
                index++;
            }
        }
    }
    public static boolean InArray(char a[], char c){
        for (char value : a) {
            if (value == c) {
                return true;
            }
        }
        return false;
    }
}
