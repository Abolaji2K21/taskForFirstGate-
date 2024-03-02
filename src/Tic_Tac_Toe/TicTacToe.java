package Tic_Tac_Toe;

import Exceptions.CellOccupiedException;

public class TicTacToe {

    private final GameType[][] scoreBoard;
    private final User[] players;
    private User winner;
    private boolean draw;

    private User currentPlayer;

    public TicTacToe(User player1, User player2) {
        scoreBoard = new GameType[][]{
                {GameType.EMPTY, GameType.EMPTY, GameType.EMPTY},
                {GameType.EMPTY, GameType.EMPTY, GameType.EMPTY},
                {GameType.EMPTY, GameType.EMPTY, GameType.EMPTY}
        };
        players = new User[]{player1, player2};
        currentPlayer = player1;
    }

    public User getWinner() {
        return winner;
    }

    public boolean isDraw() {
        return draw;
    }
    public User[] getPlayers() {
        return players;
    }

    public GameType[][] getScoreBoard() {
        return scoreBoard;
    }

    public User getCurrentPlayer() {
        return currentPlayer;
    }

    private boolean checkWin() {
        for (int row = 0; row < 3; row++) {
            if ((scoreBoard[row][0] == currentPlayer.getType()) &&
                    (scoreBoard[row][1] == currentPlayer.getType()) &&
                    (scoreBoard[row][2] == currentPlayer.getType())) {
                return true;
            }
        }

        for (int column = 0; column < 3; column++) {
            if ((scoreBoard[0][column] == currentPlayer.getType()) &&
                    (scoreBoard[1][column] == currentPlayer.getType()) &&
                    (scoreBoard[2][column] == currentPlayer.getType())) {
                return true;
            }
        }

        if ((scoreBoard[0][0] == currentPlayer.getType()) &&
                (scoreBoard[1][1] == currentPlayer.getType()) &&
                (scoreBoard[2][2] == currentPlayer.getType())) {
            return true;
        }
        if ((scoreBoard[0][2] == currentPlayer.getType()) &&
                (scoreBoard[1][1] == currentPlayer.getType()) &&
                (scoreBoard[2][0] == currentPlayer.getType())) {
            return true;
        }

        return false;
    }

    private boolean checkDraw() {
        for (int row = 0; row < scoreBoard.length; row++) {
            for (int column = 0; column < scoreBoard[row].length; column++ ) {
                if (scoreBoard[row][column] == GameType.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public void makeMove(int row, int column) {
        if (isCellOccupied(row, column)) {
            throw new CellOccupiedException("Cell at row or column is already occupied");
        } else if (row < 0 || column < 0) {
            throw new ArrayIndexOutOfBoundsException("Row and column values cannot be negative");
        } else if (row > 3 || column > 3){
            throw new ArrayIndexOutOfBoundsException("Row and column values cannot be greater or equal to Three");
        }


        markCell(row, column, currentPlayer.getType());

        updateGameStatus();

        switchPlayer();
    }

    private boolean isCellOccupied(int row, int column) {
        return scoreBoard[row][column] != GameType.EMPTY;
    }

    private void markCell(int row, int column, GameType player) {
        scoreBoard[row][column] = player;
    }

    private void updateGameStatus() {
        if (checkWin()) {
            winner = currentPlayer;
        } else if (checkDraw()) {
            draw = true;
        }
    }

    private void switchPlayer() {
        if (currentPlayer == players[0]) {
            currentPlayer = players[1];
        } else {
            currentPlayer = players[0];
        }
    }

    public boolean isGameOver() {
        return winner != null || checkDraw();
    }


}
