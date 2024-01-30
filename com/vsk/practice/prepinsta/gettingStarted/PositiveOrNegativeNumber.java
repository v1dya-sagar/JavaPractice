package com.vsk.practice.prepinsta.gettingStarted;

public class PositiveOrNegativeNumber {
    public static void main(String[] args) {
        int number  = 5;
        if(number == 0) {
            System.out.println("Zero");
        } else {
            System.out.println(number > 0? "+ve" : "-ve");
        }
    }
}
