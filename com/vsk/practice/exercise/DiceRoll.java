package com.vsk.practice.exercise;

import java.util.Scanner;

public class DiceRoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int diceOne, diceTwo;
            diceOne = scanner.nextInt();
            diceTwo = scanner.nextInt();
            if (diceOne != diceTwo) {
                sum += diceOne + diceTwo;
                break;
            } else {
                sum += diceOne + diceTwo;
            }
        }
        System.out.println(sum);
    }
}

