package com.bridgelabz.tictactoe;


import java.util.Scanner;

public class TicTacToeGame {
    static char[] board = new char[10];
    static Scanner sc = new Scanner(System.in);
    static char computerVar;
    static char userVar;
    static int numberOfFreeSpaces = 9;
    static boolean gameOver = false;

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
    public static void showBoard()
    {
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("----------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("----------");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
    }
    /*
     * UC4
     * get input from user to make a move
     * */
    public static void makePlayerMove(){
        System.out.println("Choose your location (1-9): ");
        int playerPosition = sc.nextInt();

        checkFreeSpace(playerPosition, userVar);
        System.out.println("Players move  : "+playerPosition);
    }
    /*
     * UC5
     * check for free space
     */
    public static void checkFreeSpace(int playerPosition, char turn){
        if( numberOfFreeSpaces > 0){
            if(board[playerPosition] == ' '){
                board[playerPosition] = turn;
                numberOfFreeSpaces--;
            }else{
                System.out.println(playerPosition + " occupied choose other position :");
                if(turn == userVar)
                    makePlayerMove();

            }
        }else{
            System.out.println("There is no free space on board! Exiting game.");
            gameOver = true;
        }
    }

    /*
     * UC6
     * check how plays first
     */
    public static String doToss(){
        int coin = (int) Math.floor(Math.random()*10) % 2;
        if(coin < 5){
            return "tails";
        }else{
            return "heads";
        }

    }





}
