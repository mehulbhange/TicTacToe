package com.bridgelabz.tictactoe;

public class TicTacToeGame {
    static char[] board = new char[10];

    public static void main(String[] args) {
        System.out.println("Tic tac toe");
        for(int i=0;i<10;i++){
            board[i] = ' ';
        }

    }
}
