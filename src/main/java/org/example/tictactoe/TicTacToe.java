package org.example.tictactoe;

public class TicTacToe {
    public static void main(String[] args) {
        while(!game.isGameOver()) {
            game.move();
        }
        game.displayResults();
    }

    private static final Game game = new Game();
}
