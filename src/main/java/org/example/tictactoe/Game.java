package org.example.tictactoe;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Game {

    public Game() {
        moves.clear();
        setPlayer(1, Markers.O);
        setPlayer(2, Markers.X);
    }

    public void setPlayer(int player, Markers marker) {
        players.put(player, new Player(player, marker));
    }

    private void movePlayer(int player, int row, int column) {
        System.out.println("\nPlayer " + player + " [" + players.get(player).marker() + "] Turn:\n");
        moves.move(row, column, players.get(player));
    };

    public boolean isGameOver() {
        return moves.isGameOver();
    }

    public void move() {
        int row, col;
        do {
            System.out.print("[Player " + player + "] '" + players.get(player).marker() + "' Enter Row (0 - " + (Board.DIMENSION - 1) + "): \t");
            row = scanner.nextInt();
            scanner.nextLine();

            System.out.print("[Player " + player + "] '" + players.get(player).marker() + "' Enter Column (0 - " + (Board.DIMENSION - 1) + "): \t");
            col = scanner.nextInt();
            scanner.nextLine();
        } while (! isMoveValid(row, col));

        movePlayer(player, row, col);
        togglePlayer();
    }

    public void displayResults() {
        moves.displayResults();
    }

    private void togglePlayer() {
        if (player == 1) {
            player = 2;
        } else {
            player = 1;
        }
    }

    private boolean isMoveValid(int row, int col) {
        boolean isValid = moves.isMoveValid(row, col);
        if (isValid) {
            return true;
        } else {
            System.out.println("Sorry - That square is already taken! Please try again:");
            return false;
        }
    }

    private final Map<Integer, Player> players = new HashMap<>();
    private final Moves moves = new Moves();
    private static final Scanner scanner = new Scanner(System.in);

    private int player = 1;

}
