package com.vsk.practice.DataStructures.Stacks.Problems;

import java.util.Stack;

public class ImplementQueueUsingStack {
    public static void main(String[] args) {

    }
    static class MyQueue {

        Stack<Integer> input = new Stack();
        Stack<Integer> output = new Stack();

        public void push(int x) {
            input.push(x);
        }

        public int pop() {
            peek();
            return output.pop();
        }

        public int peek() {
            if (output.empty())
                while (!input.empty())
                    output.push(input.pop());
            return output.peek();
        }

        public boolean empty() {
            return input.empty() && output.empty();
        }
    }
}
