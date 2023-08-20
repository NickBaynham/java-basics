package org.example.tictactoe;

public class Moves {
    public void move(int row, int column, Player player) {
        board.set(row, column, player.marker());
        board.display();
        check(player);
    }

    public void clear() {
        board.clear();
        board.display();
    }

    public boolean isGameOver() {
        return board.isGameOver();
    }

    public void displayResults() {
        board.displayResults();
    }

    public boolean isMoveValid(int row, int col) {
        return board.getBoard()[row][col].equals(Markers.N);
    }

    private void check(Player player) {
        checkForNoMoves();
        checkForWin(player);
    }

    private void checkForNoMoves() {
        for (Markers[] row : board.getBoard()) {
            for (Markers m : row) {
                if (m.equals(Markers.N)) {
                    return;
                }
            }
        }
        this.board.setNoMoreTurns(true);
        this.board.setGameOver(true);
    }

    private void checkForWin(Player player) {

        // check for row win
        boolean win = true;
        for (Markers[] row : board.getBoard()) {
            for (Markers m : row) {
                if (!m.equals(player.marker())) {
                    win = false;
                    break;
                }
            }
            if (win) {
                this.board.setGameOver(true);
                this.board.setWinner(player);
                return;
            }
        }

        // check for column win
        for (int column = 0; column < board.getBoard()[0].length; column++) {
            win = true;
            for (int row = 0; row < board.getBoard()[0].length; row++) {
                if (! board.getBoard()[row][column].equals(player.marker())) {
                    win = false;
                    break;
                }
            }
            if (win) {
                this.board.setWinner(player);
                this.board.setGameOver(true);
                return;
            }
        }

        // check for a diagonal win
        win = true;
        for (int i = 0; i < board.getBoard()[0].length; i++) {
            if (! board.getBoard()[i][i].equals(player.marker())) {
                win = false;
                break;
            }
        }
        if (win) {
            this.board.setWinner(player);
            this.board.setGameOver(true);
            return;
        }

        // check for mirror diagonal win
        int col = board.getBoard()[0].length - 1;
        for (int row = 0; row < board.getBoard()[0].length; row++) {
            if (! board.getBoard()[row][col].equals(player.marker())) {
                return;
            }
            col--;
        }
        this.board.setWinner(player);
        this.board.setGameOver(true);
    }

    private final Board board = new Board();
}
