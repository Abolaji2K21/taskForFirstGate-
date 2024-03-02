package Tic_Tac_Toe;

public class TicTacToe {

    private final GameType[][] scoreBoard;
    private final User[] players = new User[2];

    public TicTacToe(User[] players){
        scoreBoard = new GameType[3][3];

    }
}
