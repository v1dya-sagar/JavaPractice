package com.vsk.practice.miscellaneous.controlflow_statements;

public class ForLoopInterest {
    public static void main(String[] args){
        for (int i=8; i>1;i--){
            System.out.println("10000 at " + i + "% interest = " + String.format("%.2f",calcInterest(10000.00,i)));
        }

    }
    public static double calcInterest(double amount , double interestRate){
        return(amount*(interestRate/100));
    }
}
