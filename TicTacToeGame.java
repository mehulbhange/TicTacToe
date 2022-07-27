package com.bridgelabz.tictactoe;

import java.util.Locale;
import java.util.Scanner;

public class TicTacToeGame {
    static char[] board = new char[10];
    static Scanner sc = new Scanner(System.in);
    static char computerVar;
    static char userVar;

    public static void main(String[] args) {
        System.out.println("Tic tac toe");
        for(int i=0;i<10;i++){
            board[i] = ' ';
        }

        getUserChoice();

    }

    public static void getUserChoice(){
        System.out.println("Enter your choice X or O :");
        userVar = sc.next().toLowerCase().charAt(0);
        if(userVar == 'x'){
            computerVar = 'o';
        }else{
            computerVar = 'x';
        }
    }
}
