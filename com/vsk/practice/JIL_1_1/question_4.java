package com.vsk.practice.JIL_1_1;
import java.util.Scanner;
public class question_4 {
    public static void main(String[] args) {
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Character : ");
        ch = scanner.next().charAt(0);
        if(ch >= 65 && ch <=90){
            System.out.println("Character is Uppercase");
        } else if (ch >= 97 && ch <=122) {
            System.out.println("Character is Lowercase");
        }
    }
}
