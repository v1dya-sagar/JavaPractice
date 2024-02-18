package com.vsk.practice.codersClub.feb_week_3;

public class DesignerPDFViewer {
    public static void main(String[] args) {
        String s = "zaba";
        int[] a = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
        int max = Integer.MIN_VALUE;
        for(char c : s.toCharArray()){
            if(a[c - 'a'] > max){
                max = a[c - 'a'];
            }
        }
        // to get result
        System.out.println(max * s.length());
    }
}
