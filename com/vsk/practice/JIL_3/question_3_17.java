package com.vsk.practice.JIL_3;

public class question_3_17 {
    public static void main(String[] args) {
        String str1 = "Hi! Good morning. Have a Good day Good sir.";
        String old_string = "Good";
        String new_string = "Very-Good";

        String resultStr = str1.replace(old_string, new_string);

        System.out.println(resultStr);
    }
}
