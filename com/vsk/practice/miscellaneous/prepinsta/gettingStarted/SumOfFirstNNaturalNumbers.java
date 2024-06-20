package com.vsk.practice.miscellaneous.prepinsta.gettingStarted;

public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(sum(n));
    }
    public static int sum(int num){
        if(num == 0){
            return num;
        } else {
            return num + sum(num - 1);
        }
    }
}
