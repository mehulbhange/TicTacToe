package com.bridgelabz.tictactoe;


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

    /*
    * UC3
    * showBoard
    * */
    private static void showBoard()
    {
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("----------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("----------");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
    }
}
