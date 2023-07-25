/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.xo_oop;

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
                System.out.print(table[i][j]+" ");

            }
            System.out.println();

        }
    }

}
