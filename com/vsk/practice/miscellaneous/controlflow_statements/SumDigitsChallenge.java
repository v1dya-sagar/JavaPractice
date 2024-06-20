package com.vsk.practice.miscellaneous.controlflow_statements;

public class SumDigitsChallenge {

    public static void main(String[] args) {

        System.out.println(sumDigits(-1));

    }

    public static int sumDigits(int number){
        int sum=0;
        if(number<0){
            return -1;
        }
        while(number>0){

            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;

    }
}
