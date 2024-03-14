package TurtleGraphics;

import static TurtleGraphics.Direction.*;

public class Turtle {
    private boolean isPenUp = true;

    private TurtlePosition currentPosition = new TurtlePosition(0, 0);;
    private Direction currentDirection = EAST;

    public boolean isPenUp() {
        return isPenUp;
    }

    public void penDown() {
        isPenUp = false;
    }

    public void penUp() {
        isPenUp = true;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnLeft() {
        currentDirection = currentDirection.turnLeft();
    }

    public void turnRight() {
        currentDirection = currentDirection.turnRight();
    }

    public TurtlePosition getCurrentPosition() {
        return currentPosition;
    }

    public void moveForward(int numberOfStep) {
        switch (currentDirection){
            case EAST -> moveForwardViaEast(numberOfStep);

        }
    }

    private void moveForwardViaEast(int numberOfSteps) {
        int newRow = currentPosition.getRow() ;
        int newColumn = currentPosition.getColumn() + numberOfSteps - 1;
        currentPosition = new TurtlePosition(newRow, newColumn);

    }
}
