package com.vsk.practice.exercise;

public class ReverseInteger {

    public static void main(String[] args) {
        int GivenNumber = -123, ReverseNumber = 0 , remainder = 1;
        while(GivenNumber != 0)
        {
            remainder = GivenNumber % 10;
            ReverseNumber = ReverseNumber * 10 + remainder;
            GivenNumber = GivenNumber/10;
        }
        System.out.println(ReverseNumber);
    }
}
