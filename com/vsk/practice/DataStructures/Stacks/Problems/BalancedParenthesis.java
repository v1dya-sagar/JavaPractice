package com.vsk.practice.DataStructures.Stacks.Problems;

import java.util.Stack;

public class BalancedParenthesis {

    public static void main(String[] args) {


        String str = "[][]{(()}{}";

        System.out.println(checkBalanced(str));


    }
    public static boolean checkBalanced(String str) {

        Stack<Character> stack = new Stack<>();
        for(int i = 0;i < str.length();i++) {
            if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
                stack.push(str.charAt(i));
                continue;
            }
            if(!stack.isEmpty()) {
                if((str.charAt(i) == '}' && stack.peek() == '{') || (str.charAt(i) == ']' && stack.peek() == '[') || (str.charAt(i) == ')' && stack.peek() == '(')) {
                    stack.pop();
                }
                continue;
            }
            if(str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')') {
                return false;
            }
        }
        if(stack.isEmpty()) {
            return true;
        }

        return false;

    }



}
