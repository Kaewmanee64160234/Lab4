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

    String[][] table = {{"-", "-", "-",}, {"-", "-", "-",}, {"-", "-", "-",}};

    private Player currentPlay;

    public void setCurrentPlay(Player currentPlay) {
        this.currentPlay = currentPlay;
    }
    private Player player1;
    private Player player2;
    int row, column;
    Scanner sc = new Scanner(System.in);

    public Table(Player currentPlay, Player player1, Player player2) {

        this.currentPlay = currentPlay;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void setTable(String[][] table) {
        this.table = table;
    }

    public String[][] getTable() {
        return table;
    }

    public Player getCurrentPlay() {
        return currentPlay;
    }

    public boolean setRowCol(int row, int column) {

        if (table[row - 1][column - 1] == "-") {
            table[row - 1][column - 1] = currentPlay.getSymbol();
            this.column = column;
            this.row = row;
            return true;
        }

        return false;

    }

    public void changePlayer() {
        if (currentPlay.getSymbol().equals(player1.getSymbol()) ) {
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
            System.out.println(player1.toString());
            System.out.println(player2.toString());
            return true;

        } else {
            if (checkDraw()) {

                System.out.println("+--------------------+");
                System.out.println("|    !!! Draw !!!    |");
                System.out.println("+--------------------+");
                saveWin("draw");
                System.out.println(player1.toString());
                System.out.println(player2.toString());
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
            } else {
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

    public boolean askContinute() {
        System.out.print("You want to play again? (Y/n): ");
        String input = sc.next().toLowerCase();
        while (!input.equals("y") && !input.equals("n")) {
            System.out.print("You want to play again (Y/N) : ");
            input = sc.next().toLowerCase();
        }
        if (input.equals("n")) {
            return false;
        } else {
            currentPlay = player2;
            String[][] table_ = {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
            setTable(table_);

            return true;
        }

    }

}
