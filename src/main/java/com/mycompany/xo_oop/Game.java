/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.xo_oop;

/**
 *
 * @author USER
 */
public class Game {
    public static void main(String[] args) {
        Player player1 =  new Player("X", 0, 0, 0);
        Player player2 = new Player("O", 0, 0, 0);
        String [][] board = {{"-","-","-"},{"-","-","-"},{"-","-","-"}};
Table table = new Table(board,player1,player1,player2);
        table.printTable();
    }
    
}
