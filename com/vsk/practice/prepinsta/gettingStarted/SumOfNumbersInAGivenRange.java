package com.vsk.practice.prepinsta.gettingStarted;

public class SumOfNumbersInAGivenRange {
    public static void main(String[] args) {
        int num1 = 12, num2 = 15, result = 0;
        for(int i = num1; i <= num2; i++){
            result += i;
        }
        System.out.println(result);
    }
}
