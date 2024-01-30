package com.vsk.practice.JIL_3;

import java.util.Scanner;

public class question_3_5 {
    public static void main(String[] args) {
        int upperAlphabets =0 , lowerAlphabets = 0 , digits =0 , specialCharacters =0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = scan.nextLine();
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) >= 65 && str.charAt(i) <= 90){
                upperAlphabets++;
            } else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                lowerAlphabets++;
            } else if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                digits++;
            } else {
                specialCharacters++;
            }
        }
        System.out.println("Number of Upper case Letters : " + upperAlphabets);
        System.out.println("Number of Lower case Letters : " + lowerAlphabets);
        System.out.println("Number of Digits : " + digits);
        System.out.println("Number of Special Characters : " + specialCharacters);



    }
}
