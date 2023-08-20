package org.example.tictactoe;

import java.util.Arrays;

public class Board {

    private boolean gameOver = false;
    private boolean noMoreTurns = false;
    private Player winner;
    public static final int DIMENSION = 3;
    private static final Markers[][] board = new Markers[DIMENSION][DIMENSION];

    public void clear() {
        for (Markers[] row : board) {
            Arrays.fill(row, Markers.N);
        }
    }

    public void set(int row, int column, Markers value) {
        board[row][column] = value;
    }

    public void display() {
        for (Markers[] row : board) {
            for (Markers m : row) {
                System.out.print(format(m) + " ");
            }
            System.out.println();
        }
    }

    private String format(Markers marker) {
        return " " + marker.toString() + " ";
    }

    public Markers[][] getBoard() {
        return board;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public boolean isNoMoreTurns() {
        return noMoreTurns;
    }

    public void setNoMoreTurns(boolean noMoreTurns) {
        this.noMoreTurns = noMoreTurns;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player player) {
        this.winner = player;
    }

    public void displayResults() {
        if (gameOver) {
            if (noMoreTurns) {
                System.out.println("*** DRAW!!!! No More Turns! ***");
            } else if (getWinner() != null) {
                System.out.println("*** Player " + getWinner().player() + " Wins!!!!");
            } else {
                System.out.println("*** Game in Progress ***");
            }
        }
    }
}
