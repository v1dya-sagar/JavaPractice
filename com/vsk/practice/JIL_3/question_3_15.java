package com.vsk.practice.JIL_3;

public class question_3_15 {
    public static void main(String[] args) {
        String str1 = "Hi! Good morning. Have a Good day.";
        String old_string = "Good";
        String new_string = "Very-Good";

        String resultStr = str1.replaceFirst(old_string, new_string);

        System.out.println(resultStr);
    }
}
