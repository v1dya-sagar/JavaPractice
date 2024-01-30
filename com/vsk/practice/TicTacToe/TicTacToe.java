package com.vsk.practice.TicTacToe;


import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[3][3];
        int row, col;
        char player = 'X';

        initializeBoard(board);

        printBoard(board);

        while (true) {
            System.out.println("Player " + player + ", enter row (1-3): ");
            row = scanner.nextInt() - 1;
            System.out.println("Player " + player + ", enter column (1-3): ");
            col = scanner.nextInt() - 1;

            if (board[row][col] == ' ') {
                board[row][col] = player;
                printBoard(board);
                if (checkForWin(board, player)) {
                    System.out.println("Player " + player + " wins!");
                    return;
                }
                player = (player == 'X') ? 'O' : 'X';
            } else {
                System.out.println("That spot is already taken.");
            }
        }
    }

    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], ' ');
        }
    }

    public static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (char[] chars : board) {
            System.out.print("| ");
            for (int j = 0; j < chars.length; j++) {
                System.out.print(chars[j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public static boolean checkForWin(char[][] board, char player) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }
}

