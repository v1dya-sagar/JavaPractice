package com.vsk.practice.miscellaneous.methods;

public class MethodsChallenge {
    public static void main(String[] args) {

        int Position;
         Position = calculateHighScorePosition(1500);
        displayHighScorePosition("Killua",Position);

        Position = calculateHighScorePosition(900);
        displayHighScorePosition("Gon",Position);

        Position = calculateHighScorePosition(400);
        displayHighScorePosition("Leorio",Position);

        Position = calculateHighScorePosition(50);
        displayHighScorePosition("Kurapika",Position);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get a position " +
        playerPosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
