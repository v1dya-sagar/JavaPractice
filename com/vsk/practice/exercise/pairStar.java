package com.vsk.practice.exercise;

import java.util.Scanner;

public class pairStar {
    public static String pair_Star(String str) {

//		backward approach

//		if(str.length() == 0 || str.length() == 1) {
//			return str;
//		}
//
//		String smallStr = pairStar(str.substring(1));
//		if(smallStr.charAt(0) == str.charAt(0)) {
//			return str.charAt(0) + "*" + smallStr;
//		}
//		return str.charAt(0) + smallStr;

//		forward approach

        if(str.isEmpty() || str.length() == 1) {
            return str;
        }

        if(str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + pair_Star(str.substring(1));
        }

        return str.charAt(0) + pair_Star(str.substring(1));

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = pair_Star(str);
        System.out.println(res);
        sc.close();

    }
}
