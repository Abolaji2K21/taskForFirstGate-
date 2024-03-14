package TurtleGraphics;

public class SketchBoard {
    private int[][] sketchboard;

    public int[][] getBoard() {
        return new int[20][20];
    }

    public void displayBoard() {
        for (int row=0; row<20; row++) {
            for (int column=0; column<20; column++) {
                if (sketchboard[row][column] == 1) System.out.print("# ");
                if (sketchboard[row][column] == 0) System.out.print("  ");

            }
            System.out.println();
        }
    }
}
