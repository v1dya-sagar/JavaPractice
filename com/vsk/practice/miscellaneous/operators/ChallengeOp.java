package com.vsk.practice.miscellaneous.operators;

public class ChallengeOp {
    public static void main (String[] args){
        double double1 = 20d;
        double double2 = 80d;
        double value1 = (double1 + double2) * 100d;
        System.out.println(value1);
        double value2 = value1 % 40d;
        System.out.println(value2);
        boolean cond = (value2 == 0)? true : false;
        System.out.println(cond);
        if(!cond){
            System.out.println("Got some Remainder");
        }
    }
}
