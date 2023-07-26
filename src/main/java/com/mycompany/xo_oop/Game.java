/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.xo_oop;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Game {

     Player player1 = new Player("X", 0, 0, 0);
     Player player2 = new Player("O", 0, 0, 0);
    private Table table = new Table(player1, player1, player2);
    boolean isEnd = false;
    String[][] t = table.getTable();
    Scanner sc = new Scanner(System.in);

    public void startGame() {
        System.out.println("Welcome to XO Game");
        System.out.print("Start XO Games? (Y/N) :");
        Scanner sc = new Scanner(System.in);
        String input = sc.next().toLowerCase();
        while (!input.equals("y") && !input.equals("n")) {
            System.out.println("Welcome to XO Game");
            System.out.print("Start XO Games? (Y/N) :");
            input = sc.next().toLowerCase();
        }
        if (input.equals("n")) {
            isEnd = true;
        } else {
            isEnd = false;
        }
    }

    public void process() {
        showTable();
        showTurn();
        while (!isEnd) {
            if (inputRowAndColumn()) {
                showTable();
                checkWinner();
                changeTurn();

            }

        }
       showGoodBye();
    }

   

    public void showTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(t[i][j] + " ");

            }
            System.out.println();

        }
    }

    private void showTurn() {
        System.out.println("Your " + table.getCurrentPlay().getSymbol() + " Turn >>>");
    }

    private void changeTurn() {
        table.changePlayer();
    }

    private boolean inputRowAndColumn() {
        System.out.print("input row: ");
        int row = sc.nextInt();
          System.out.print("input column: ");
        int column = sc.nextInt();
        return table.setRowCol(row, column);
    }

    private boolean checkWinner() {
        if (table.checkWinner()) {
            isEnd = true;
        }
        return false;
    }
    public static void main(String[] args) {
        Game game  = new Game();
        game.process();
    }

    private void showGoodBye() {
        System.out.println(player1.toString());
        System.out.println(player2.toString());
        System.out.println("Good Bye!!");
    }

}
