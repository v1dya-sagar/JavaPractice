package com.vsk.practice.exercise;

import java.util.ArrayList;
import java.util.List;

public class SumOfNumbersInAlphanumeric {
    public static void main(String[] args) {
        String str = "1abc34zz65";
        StringBuilder temp = new StringBuilder("0");
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch))
                temp.append(ch);
            else {
                sum += Integer.parseInt(temp.toString());
                temp = new StringBuilder("0");
            }
        }
        System.out.println(sum + Integer.parseInt(String.valueOf(temp)));
    }
}
