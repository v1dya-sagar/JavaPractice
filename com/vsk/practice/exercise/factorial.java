package com.vsk.practice.exercise;

public class factorial {
    public static void main(String[] args) {
        int a = 5, res = 1;
        for(int i = 1; i<=a;i++){
            res = res*i;
        }
        System.out.println(res);
    }
}
