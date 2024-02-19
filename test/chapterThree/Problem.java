package chapterThree;

public class Problem {
    private String name;
    private boolean solved;
    private Type type;

    public Problem (String name , Type type){
        this.name = name;
        this.type = type;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

    public boolean isSolved() {
        return solved;
    }

    public Type getType() {
        return type;
    }
}
