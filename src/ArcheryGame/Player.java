package ArcheryGame;

public class Player{

    private final int id;

    public Player(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void play(ArcheryGame archeryGame){
        archeryGame.markScoreBoard(this.id);

    }

}