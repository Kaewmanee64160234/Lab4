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
public class Table {

    private String[][] table;

    private Player currentPlay;
    private Player player1;
    private Player player2;

    public Table(String[][] table, Player currentPlay, Player player1, Player player2) {
        this.table = table;
        this.currentPlay = currentPlay;
        this.player1 = player1;
        this.player2 = player2;
    }

    public String[][] getTable() {
        return table;
    }

    public Player getCurrentPlay() {
        return currentPlay;
    }

    public void printTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(table[i][j] + " ");

            }
            System.out.println();

        }
    }

    public boolean setRowCol(int row, int column) {
        Scanner sc = new Scanner(System.in);
          if ((row > 0 && row < 4) && (column > 0 && column < 4)) {
            while (!table[row - 1][column - 1].equals("-")) {
                System.out.println("--------------------------------");
              
                System.out.print("Input Row: ");
                row = sc.nextInt();
                System.out.print("Input Column: ");
                column = sc.nextInt();

            }
            table[row - 1][column - 1] = currentPlay.getSymbol();
            return true;
        } else {

            return false;
        }
    }

    public void changePlayer() {
        if (currentPlay == player1) {
            currentPlay = player2;
        } else {
            currentPlay = player1;
        }
    }
}
