package com.vsk.practice.JIL_3;
public class question_3_13 {
    public static void main(String[] args) {
        String str = "This is a word oo oo";
        char c = 'o';
        StringBuffer str1 = new StringBuffer();
        char[] a = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != c) {
                a[i] = str.charAt(i);
            }
        }
        for (char b : a) {
            if ((b >= 65 && b < 90) || (b >= 97 && b <= 122) || b == 32) {
                str1.append(b);
            }
            System.out.println(str1);
        }
    }
}

