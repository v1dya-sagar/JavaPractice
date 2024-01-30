package com.vsk.practice.exercise;
public class ReverseStringWithAlphabetsAndNumbersOnly {
    public static void main(String[] args) {
        String input = "house! is: located@ Ind91.";
        char[] characterArray = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            if (!isNumberOrAlphabet(input.charAt(i))) {
                characterArray[i] = input.charAt(i);
            }
        }
        StringBuilder newInput = new StringBuilder(modifyString(input));
        int i1 = 0;
        for(int i = 0; i < characterArray.length; i++){

            if(characterArray[i] == '\u0000'){
                characterArray[i] = newInput.charAt(i1++);
            }
        }
        String stringResult = new String(characterArray);
        System.out.println(stringResult);
    }

    public static boolean isNumberOrAlphabet(char letter) {
        return Character.isDigit(letter) || Character.isAlphabetic(letter);
    }

    public static StringBuffer modifyString(String input) {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < input.length(); i++) {
            if (isNumberOrAlphabet(input.charAt(i))) {
                s.append(input.charAt(i));
            }
        }
        return s.reverse();
    }
}




