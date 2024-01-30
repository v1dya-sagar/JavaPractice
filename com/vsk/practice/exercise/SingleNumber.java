package com.vsk.practice.exercise;

public class SingleNumber {
    public static void main(String[] args) {
        int a[] = {1,2,1,2,3} , result = 0;
        for(int i : a){
            result ^= i;
        }
        System.out.println(result);
    }
}
