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

        createEmptyBoard();

        getUserChoice();



    }

    /*
     * UC1
     * create a empty board
     */
    public static void createEmptyBoard(){
        for(int i=1;i<10;i++){
            board[i] = ' ';
        }
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
                else
                    makeComputerMove();
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
        if(coin == 0){
            return "tails";
        }else{
            return "head";
        }

    }

    /*
     * UC7
     * check for winner
     */
    public static void winner(){
        if ((board[1] == userVar && board[2] == userVar && board[3] == userVar) ||
                (board[4] == userVar && board[5] == userVar && board[6] == userVar) ||
                (board[7] == userVar && board[8] == userVar && board[9] == userVar) ||
                (board[1] == userVar && board[5] == userVar && board[9] == userVar) ||
                (board[3] == userVar && board[5] == userVar && board[7] == userVar) ||
                (board[1] == userVar && board[4] == userVar && board[7] == userVar) ||
                (board[3] == userVar && board[6] == userVar && board[9] == userVar) ||
                (board[2] == userVar && board[5] == userVar && board[8] == userVar))
        {
            showBoard();
            System.out.println("Player won the game");
            gameOver = true;
        }else if ((board[1] == computerVar && board[2] == computerVar && board[3] == computerVar) ||
                (board[4] == computerVar && board[5] == computerVar && board[6] == computerVar) ||
                (board[7] == computerVar && board[8] == computerVar && board[9] == computerVar) ||
                (board[1] == computerVar && board[5] == computerVar && board[9] == computerVar) ||
                (board[3] == computerVar && board[5] == computerVar && board[7] == computerVar) ||
                (board[1] == computerVar && board[4] == computerVar && board[7] == computerVar) ||
                (board[3] == computerVar && board[6] == computerVar && board[9] == computerVar) ||
                (board[2] == computerVar && board[5] == computerVar && board[8] == computerVar))
        {
            showBoard();
            System.out.println("Computer won the game");
            gameOver = true;
        }else if(numberOfFreeSpaces == 0){
            System.out.println("Game Tie");
            gameOver = true;
        }
    }
    /*
     * UC8
     * make computer move
     */
    public static void makeComputerMove(){
        int computerePosition = (int) Math.floor(Math.random() * 10) % 9 + 1;
        checkFreeSpace(computerePosition, computerVar);

        System.out.println("computer move :" + computerePosition);

    }





}
