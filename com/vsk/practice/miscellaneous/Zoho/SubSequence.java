package com.vsk.practice.miscellaneous.Zoho;

public class SubSequence {
    public static void main(String[] args) {
        String a1 = "place";
        String b1 = "HopliteOfMacedonia";
        System.out.println(isSubsequence(a1, b1));
    }
    public static String isSubsequence(String a, String b) {
        int pointerA = 0;
        int pointerB = 0;

        while (pointerA < a.length() && pointerB < b.length()) {
            if (a.charAt(pointerA) == b.charAt(pointerB)) {
                pointerA++;
            }
            pointerB++;
        }

        if (pointerA == a.length()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
