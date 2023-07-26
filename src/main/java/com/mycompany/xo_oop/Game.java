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
    boolean isEnd = false;

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
    }

    public static void main(String[] args) {

    }

}
