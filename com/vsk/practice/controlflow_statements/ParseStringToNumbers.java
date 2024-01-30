package com.vsk.practice.controlflow_statements;

public class ParseStringToNumbers {
    public static void main(String[] args) {
        String number = "2022";
        System.out.println("year = " + number);
        int year = Integer.parseInt(number);
        year +=1;
        System.out.println(year);
    }
}

