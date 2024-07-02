package com.vsk.practice.DataStructures.Stacks.Problems;


import java.util.Stack;

public class ReverseStack {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        Stack<Integer> stack = new Stack<>();
        for(int number : arr) {
            stack.push(number);
        }
        Stack<Integer> helperStack = new Stack<>();
        reverseStack(stack, helperStack);

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }

    public static void reverseStackRecursive(Stack<Integer> stack, Stack<Integer> helperStack) {

        if(stack.isEmpty()) {
            return;
        }

        int num = stack.pop();
        reverseStackRecursive(stack, helperStack);
        helperStack.push(num);


    }

    public static void reverseStack(Stack<Integer> stack, Stack<Integer> helperStack) {

        reverseStackRecursive(stack, helperStack);
        while(!helperStack.isEmpty()) {
            stack.push(helperStack.pop());
        }

    }



}
