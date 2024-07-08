package com.vsk.practice.exercise.daily;

import java.util.ArrayDeque;
import java.util.Deque;

public class WinnerOfCircularGame {
    // deque approach that uses extra space T_T
    public static void main(String[] args) {
        Deque<Integer> players = new ArrayDeque<>();
        int noOfPLayers = 5, count = 2;

        for(int i = 1; i <= noOfPLayers; i++){
            players.add(i);
        }

        while(players.size() > 1) {
            for (int j = 1; j < count; j++) {
                players.addLast(players.pollFirst());
            }
            players.removeFirst();
        }

        System.out.println(players.getFirst());

    }
}
