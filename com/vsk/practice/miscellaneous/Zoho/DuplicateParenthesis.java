package com.vsk.practice.miscellaneous.Zoho;

import java.util.Stack;

public class DuplicateParenthesis {


    public static void main(String[] args) {

        String str = "(((a+(b))+(c+d)))";
        System.out.println(findDuplicateParenthesis(str) ? "Duplicate Found" : "No Duplicates Found");
    }
    static boolean findDuplicateParenthesis(String givenString) {

        Stack<Character> Stack = new Stack<>();
        char[] str = givenString.toCharArray();
        for (char ch : str) {
            if (ch == ')') {
                char top = Stack.peek();
                Stack.pop();
                // stores the number of characters between a
                // closing and opening parenthesis
                // if this count is less than or equal to 1
                // then the brackets are redundant else not

                int elementsInside = 0;
                while (top != '(') {
                    elementsInside++;
                    top = Stack.peek();
                    Stack.pop();
                }
                if (elementsInside < 1) {
                    return true;
                }
            }
            // push open parenthesis '(', operators and operands to stack
            else {
                Stack.push(ch);
            }
        }
        // No duplicates found
        return false;
    }


}
