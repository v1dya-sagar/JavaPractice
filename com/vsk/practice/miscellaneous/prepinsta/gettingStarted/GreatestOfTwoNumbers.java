package com.vsk.practice.miscellaneous.prepinsta.gettingStarted;

public class GreatestOfTwoNumbers {
    public static void main(String[] args) {
        int num1 = 1 , num2 = 2;
        if(num1 == num2){
            System.out.println("Equal");
        } else {
            System.out.println(num1 > num2? num1 : num2);
        }
    }
}
