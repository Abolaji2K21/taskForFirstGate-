package Tic_Tac_Toe;

import ArcheryGame.ArcheryGame;
import Exceptions.InvalidUserIDException;
import Exceptions.NullGameTypeException;

public class User {
    private final int id;
//    private final String nickName;
    private final GameType type;


    public User(int id, GameType type) {
        if (id <= 0) {
            throw new InvalidUserIDException("ID must be a positive integer");
        }
        if (type == null) {
            throw new NullGameTypeException("GameType must be specified");
        }
        this.id = id;
        this.type = type;
//        this.nickName = nickName;
    }

    public int getId(){
        return id;
    }
    public GameType getType(){
        return type;
    }
//    public String getNickName(){
//        return nickName;
//    }

    public void playGame(TicTacToe myTicTacToe, int row, int column){
        myTicTacToe.makeMove(row, column);
    }



}
