package com.vsk.practice.DataStructures.Stacks.Problems;

import java.util.Stack;

/**
 * created by : v1dya-sagar on 17-07-2024
 *
 * @author : v1dya-sagar
 * @date : 17-07-2024
 * @project : JavaPractice
 */
public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (ch == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                }
                if (ch == '}') {
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                }
                if (ch == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
