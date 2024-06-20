package com.vsk.practice.miscellaneous.JIL.JIL_1_2;

import java.util.Scanner;

public class question__5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;
        System.out.print("Enter an alphabet character : ");
        ch = scanner.next().charAt(0);
        switch (ch){
            case 'a': case 'A': case'e': case'E': case'i': case'I': case'o': case'O': case'u': case 'U':
                System.out.println("The character is a Vowel ");
                break;
            default:
                System.out.println("It is a Consonant");

        }
    }
}
