package com.vsk.practice.exercise;

import java.util.Stack;

public class a2b3c5 {
    public static void main(String[] args) {
        // 3[a2[c]] --> accaccacc
        // 2 stacks? one for the count and one for the result of each count. might work?
        String s = "3[a2[c]]";
        Stack<Integer> counts = new Stack<>();
        Stack<String> result = new Stack<>();

        int index = 0;
        String res = "";

        while(index < s.length()){
            if(Character.isDigit(s.charAt(index))){
                int times = 0;
                while (Character.isDigit(s.charAt(index))){
                    times = 10 * times + (s.charAt(index) - '0');
                    index += 1;
                }
                counts.push(times);
            } else if (s.charAt(index) == '[') {
                result.push(res);
                res = "";
                index += 1;
            } else if (s.charAt(index) == ']'){
                StringBuilder temp = new StringBuilder(result.pop());
                int count = counts.pop();
                temp.append(res.repeat(count));
                res = temp.toString();
                index += 1;
            } else{
                res += s.charAt(index);
                index += 1;
            }
        }
        System.out.println(res);
    }
}

// Char in String to Number or Digit as i'd like to say, is that char(digit in char form) - '0'. this returns a digit(int) which was in char form.
//        String s = "343";
//        int index = 0, sum = 0;
//        while (index < s.length()){
//            sum = 10 * sum + (s.charAt(index) - '0');
//            index += 1;
//        }
//        System.out.println(sum);