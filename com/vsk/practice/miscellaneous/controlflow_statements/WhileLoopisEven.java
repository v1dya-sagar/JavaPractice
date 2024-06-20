package com.vsk.practice.miscellaneous.controlflow_statements;

public class WhileLoopisEven {
    public static void main(String[] args) {
        System.out.println(isEven(6));
        int count = 0;
        int number = 4;
        int finishNumber = 20;
        while (number < finishNumber) {
            number++;
            if (!isEven(number)) {
                continue;
            }
            count++;
            System.out.println("Even Number = " + number);
            if (count >= 5) {
                break;
            }
        }
        System.out.println(count);
    }
    public static boolean isEven(int number){
        while(number%2==0){
            return true;
        }
        return false;

    }


}
