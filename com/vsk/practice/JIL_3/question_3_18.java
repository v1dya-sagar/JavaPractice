package com.vsk.practice.JIL_3;

public class question_3_18 {
    public static void main(String args[])
    {
        String str = "i like apples very much , apples are red in colour";
        String word = "apples";
        String a[] = str.split(" ");

        // search for pattern in a
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (word.equals(a[i])) {
                System.out.println("first occurence of word is at position : " + i + 1);
                break;
            }
        }
    }
}
