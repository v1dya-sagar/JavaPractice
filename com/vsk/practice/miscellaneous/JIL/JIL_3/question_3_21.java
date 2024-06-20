package com.vsk.practice.miscellaneous.JIL.JIL_3;

public class question_3_21 {
    public static void main(String args[])
    {
        String str = "i like apples very much , apples are red in colour";
        String word = "apples";
        String a[] = str.split(" ");

        // search for pattern in a
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (word.equals(a[i])) {
                count++;
            }
        }
        System.out.println(count);
    }
}
