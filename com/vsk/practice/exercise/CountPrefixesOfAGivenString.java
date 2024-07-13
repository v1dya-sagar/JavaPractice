package com.vsk.practice.exercise;

/**
 * created by : v1dya-sagar on 13-07-2024
 *
 * @author : v1dya-sagar
 * @date : 13-07-2024
 * @project : JavaPractice
 */
public class CountPrefixesOfAGivenString {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for(String a : words){
            if(s.startsWith(a)){
                count++;
            }
        }
        return count;
    }
}
