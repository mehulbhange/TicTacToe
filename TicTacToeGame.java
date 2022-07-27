package com.bridgelabz.tictactoe;

import java.util.Locale;
import java.util.Scanner;

public class TicTacToeGame {
    static char[] board = new char[10];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Tic tac toe");
        for(int i=0;i<10;i++){
            board[i] = ' ';
        }

    }

    public static char getUserChoice(){
        System.out.println("Enter your choice X or O :");
        char input = sc.next().toLowerCase(Locale.ROOT).charAt(0);
        return input;
    }
}
