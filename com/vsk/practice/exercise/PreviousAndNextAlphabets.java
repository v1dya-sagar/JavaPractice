package com.vsk.practice.exercise;

import java.util.*;
public class PreviousAndNextAlphabets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        if(c == 'a'){
            System.out.println("z" + ++c);
        } else if(c == 'z'){
            System.out.println(--c + "a");
        } else{
            System.out.println((char)(c - 1) + "" + (char)(c + 1));
        }
    }
}
