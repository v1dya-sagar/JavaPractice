package com.vsk.practice.exercise;

import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args)
    {
        String postfix = "31251+*-/";
        System.out.println("The Postfix Expression is: "+ postfix);
        String result = convertToInfix(postfix);
        System.out.println("The Infix Expression is : "+result);
    }

        static boolean isOperand(char ch)
        {
            // we check for uppercase and lowercase alphabets.
            return ch >= '0' && ch <= '9';// if not an Operand return false;
        }
// converts postfix to infix and returns the expression

        static String convertToInfix(String postfix)
        {
            Stack<String> inFix = new Stack<>();

            for (int i = 0; i < postfix.length(); i++)
            {
                char ch = postfix.charAt(i);

                if (isOperand(ch))
                {
                    // Push operands to stack.
                    inFix.push(ch + "");
                }

                // Step 2: Evaluate part of the expression and push it again to stack.
                else
                {
                    String op1 = inFix.pop();

                    String op2 = inFix.pop();

                    inFix.push("(" + op2 + ch + op1 + ")");
                }
            }

            return inFix.pop();
        }
    }

