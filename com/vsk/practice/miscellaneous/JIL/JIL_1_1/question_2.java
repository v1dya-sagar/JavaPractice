package com.vsk.practice.miscellaneous.JIL.JIL_1_1;
import java.util.Scanner;
public class question_2 {
    public static void main(String[] args) {
        int countA=0 ,countE=0 ,countI=0 ,countO=0 ,countU=0;
        Scanner scanner = new Scanner(System.in);
        char ch;
        System.out.println("Enter Character:");
        ch = scanner.next().charAt(0);
        switch (ch){
            case 'a': case 'A':
                countA++;
                System.out.println("A or a :" +countA);
                break;
            case 'e': case 'E':
                countE++;
                System.out.println("E or e :" + countE);
                break;
            case 'i': case 'I':
                countI++;
                System.out.println("I or i :" + countI);
                break;
            case 'o': case 'O':
                countO++;
                System.out.println("O or o :" + countO);
                break;
            case 'u': case 'U':
                countU++;
                System.out.println("U or u :" + countU);
                break;
            default:
                System.out.println("Not a Vowel");
        }
    }
}
