package com.vsk.practice.exercise.daily;

import java.util.Scanner;

public class SplitStringBy3 {
        public static void main (String[] args){
            Scanner scanner = new Scanner(System.in);
            String S = scanner.nextLine();
            scanner.close();

            String[] substrings = splitString(S);
            System.out.println(String.join(" ", substrings));
        }

        public static String[] splitString (String S){
            int length = S.length();
            int remainder = length % 3;
            int substrLength = length / 3;
            String[] substrings = new String[3];

            if (remainder == 0) {
                substrings[0] = S.substring(0, substrLength);
                substrings[1] = S.substring(substrLength, 2 * substrLength);
                substrings[2] = S.substring(2 * substrLength);
            } else if (remainder == 1) {
                substrings[0] = S.substring(0, substrLength + 1);
                substrings[1] = S.substring(substrLength + 1, 2 * substrLength + 1);
                substrings[2] = S.substring(2 * substrLength + 1);
            } else { // remainder == 2
                substrings[0] = S.substring(0, substrLength + 1);
                substrings[1] = S.substring(substrLength + 1, 2 * substrLength + 2);
                substrings[2] = S.substring(2 * substrLength + 2);
            }

            return substrings;
        }
    }
