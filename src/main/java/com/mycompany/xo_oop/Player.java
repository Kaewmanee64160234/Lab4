/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.xo_oop;

/**
 *
 * @author USER
 */
public class Player {
       private String symbol;
    private int winCount;
    private int loseCount;
    private int drawCount;


    public Player(String symbol, int winCount, int loseCount, int drawCount) {
        this.symbol = symbol;
        this.winCount = winCount;
        this.loseCount = loseCount;
        this.drawCount = drawCount;
    }
    
    public String getSymbol() {
        return symbol;
    }

    public int getWinCount() {
        return winCount;
    }

    public int getLoseCount() {
        return loseCount;
    }

    public int getDrawCount() {
        return drawCount;
    }
 
    
    
    
}
