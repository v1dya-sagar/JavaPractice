package com.vsk.practice.miscellaneous.Mitsogo;

import java.util.Stack;

/**
 * created by : v1dya-sagar on 22-07-2024
 *
 * @author : v1dya-sagar
 * @date : 22-07-2024
 * @project : JavaPractice
 */
public class ValidParenthesisExpression {
//    Check whether a given mathematical expression is valid.
//    Input : (a+b)(a*b)
//    Output : Valid
//    Input : (ab)(ab+)
//    Output : Invalid
//    Input : ((a+b/c+(a+b))
//    Output : Invalid
public static boolean isValidExpression(String expression) {
    Stack<Character> stack = new Stack<>();
    char[] chars = expression.toCharArray();
    boolean lastWasOperator = true; // To check for consecutive operators

    for (char c : chars) {
        if (c == '(') {
            stack.push(c);
            lastWasOperator = true; // After an opening parenthesis, an operator is expected
        } else if (c == ')') {
            if (stack.isEmpty() || stack.pop() != '(') {
                return false;
            }
            lastWasOperator = false; // After a closing parenthesis, an operand or an operator is expected
        } else if (isOperator(c)) {
            if (lastWasOperator) {
                return false; // Two operators in a row is invalid
            }
            lastWasOperator = true; // Mark that the last character was an operator
        } else if (isOperand(c)) {
            lastWasOperator = false; // Mark that the last character was an operand
        } else {
            return false; // Invalid character
        }
    }

    return stack.isEmpty() && !lastWasOperator; // Stack should be empty and the last character should not be an operator
}

    private static boolean isOperator(char c) {
        return c == '+' || c == '*' || c == '-' || c == '/';
    }

    private static boolean isOperand(char c) {
        return Character.isLetterOrDigit(c);
    }

    public static void main(String[] args) {
        String[] expressions = {"(a+b)(a*b)", "(ab)(ab+)", "((a+b)"};

        for (String expression : expressions) {
            if (isValidExpression(expression)) {
                System.out.println(expression + " : Valid");
            } else {
                System.out.println(expression + " : Invalid");
            }
        }
    }
}
