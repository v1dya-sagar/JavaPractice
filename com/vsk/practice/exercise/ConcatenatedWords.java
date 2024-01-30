package com.vsk.practice.exercise;


public class ConcatenatedWords {
    public static void main(String[] args) {
        String[] s = {"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"};
        for(int i = 0; i < s.length; i++){
            int count = 0;
            for(int j = 0; j <s.length; j++){
                if(s[i].equals(s[j])){
                    continue;
                }
                if(count > 2){
                    System.out.println(s[i]);
                    break;
                }
                if( s[i].length() > s[j].length() && s[i].contains(s[j])){
                    count+=1;
                }
            }
        }
    }
}
