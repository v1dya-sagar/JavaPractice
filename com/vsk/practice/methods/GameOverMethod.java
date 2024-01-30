package com.vsk.practice.methods;

public class GameOverMethod {
    public static void main(String[] args){


        int finalScore = calculateScore(true, 800, 5 , 100);
        System.out.println(finalScore);
        finalScore = calculateScore(true, 10000, 8 ,200);
        System.out.println(finalScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        else{
            return -1;
        }
    }
}
