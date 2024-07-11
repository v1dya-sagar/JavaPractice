package com.vsk.practice.exercise;

/**
 * created by : v1dya-sagar on 11-07-2024
 *
 * @author : v1dya-sagar
 * @date : 11-07-2024
 * @project : JavaPractice
 */
public class ReverseSubstringsBetweenEachPairOfParentheses {
    public String reverseParentheses(String s) {

        StringBuilder result = new StringBuilder(s);
        int start = result.lastIndexOf("(");
        int end = result.indexOf(")", start);

        while(start != -1){
            StringBuilder sb = new StringBuilder(result.substring(start + 1, end));
            sb.reverse();
            result.replace(start, end+1, sb.toString());
            start = result.lastIndexOf("(");
            end = result.indexOf(")", start);
        }
        return result.toString();
    }
}
//class Solution {
//    public String reverseParentheses(String s) {
//        Deque<Integer> indStack = new LinkedList<>();
//        StringBuilder res = new StringBuilder();
//
//        for (char char_s : s.toCharArray()) {
//            if (char_s == '(') {
//                indStack.push(res.length());
//            } else if (char_s == ')') {
//                int startInd = indStack.pop();
//                String reversed = new StringBuilder(res.substring(startInd)).reverse().toString();
//                res.replace(startInd, res.length(), reversed);
//            } else {
//                res.append(char_s);
//            }
//        }
//
//        return res.toString();
//    }
//}