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
    int row, column;

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



    public boolean setRowCol(int row, int column) {
        Scanner sc = new Scanner(System.in);
        if ((row > 0 && row < 4) && (column > 0 && column < 4)) {
            if (table[row - 1][column - 1] == "-") {
                table[row - 1][column - 1] = currentPlay.getSymbol();
                this.column = column;
                this.row = row;
                return true;
            }

            return false;

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

    public boolean checkRow() {
        for (int i = 0; i < 3; i++) {
            if (!table[row - 1][i].equals(currentPlay.getSymbol())) {
                return false;
            }

        }
        return true;
    }

    public boolean checkColumn() {
        for (int i = 0; i < 3; i++) {
            if (!table[i][column - 1].equals(currentPlay.getSymbol())) {
                return false;
            }

        }
        return true;
    }

    public boolean checkDiagonal() {
        if (row - 1 == column - 1) {
            for (int i = 0; i < 3; i++) {
                if (!table[i][i].equals(currentPlay.getSymbol())) {
                    return false;
                }

            }
            return true;
        }
        if ((row + column) - 2 == 2) {
            for (int i = 0; i < 3; i++) {
                if (!table[i][2 - i].equals(currentPlay.getSymbol())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j].equals("-")) {
                    return false;
                }

            }

        }
        return true;
    }

    public boolean checkWinner() {

        if (checkRow() || checkColumn() || checkDiagonal()) {

            System.out.println("+--------------------+");
            System.out.println("|    !!! " + currentPlay.getSymbol() + " Win !!!   |");
            System.out.println("+--------------------+");
            saveWin("win");
            return true;

        } else {
            if (checkDraw()) {

                System.out.println("+--------------------+");
                System.out.println("|    !!! Draw !!!    |");
                System.out.println("+--------------------+");
                saveWin("draw");
                return true;

            }
        }
        return false;
    }

    public void saveWin(String type) {
        if (type.equals("win")) {
            if (currentPlay == player1) {
                currentPlay.plusWin();
                player2.plusLose();
            }else{
                player2.plusWin();
                player1.plusLose();
            }

        }
        if (type.equals("draw")) {
            if (currentPlay == player1) {
                currentPlay.plusDraw();
                player2.plusDraw();
            }

        }

    }

}
