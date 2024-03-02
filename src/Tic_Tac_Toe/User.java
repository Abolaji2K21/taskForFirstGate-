package Tic_Tac_Toe;

public class User {
    private final int id;
    private final GameType type;


    public User(int id, GameType type) {
        this.id = id;
        this.type = type == 1 ? GameType.X : GameType.O;
    }
}
