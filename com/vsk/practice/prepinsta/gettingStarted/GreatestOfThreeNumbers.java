package com.vsk.practice.prepinsta.gettingStarted;

public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        int num1 = 1, num2 = 2, num3 = 2;
        if(num1 > num2 && num1 > num3){
            System.out.println(num1);
        } else if (num2 > num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }
    }
}
