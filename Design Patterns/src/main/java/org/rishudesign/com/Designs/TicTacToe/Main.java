package org.rishudesign.com.Designs.TicTacToe;

public class Main {
    public static  void  main(String args[]){
        TicTacToe game  = new TicTacToe();
        game.initializeGame();
        System.out.println("Game winner is: "+ game.startGame());
    }
}
