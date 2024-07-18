package com.vsk.practice.exercise;

/**
 * created by : v1dya-sagar on 18-07-2024
 *
 * @author : v1dya-sagar
 * @date : 18-07-2024
 * @project : JavaPractice
 */
public class PalindromicSubstring {
    public int countSubstrings(String s) {
        //
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            count += helper(s, i, i) + helper(s, i, i+1);
        }
        return count;
    }
    int helper(String s, int left, int right){
        int count = 0;
        if(right >= s.length()){
            return 0;
        }
        while(left >= 0 && right < s.length()){
            if(s.charAt(left) != s.charAt(right)){
                break;
            }
            count++;
            left--;
            right++;

        }
        return count;
    }
}
