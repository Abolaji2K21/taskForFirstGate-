package TurtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static TurtleGraphics.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    private Turtle turtle;
    private SketchBoard sketchBoard;

    @BeforeEach
    public void initialiseTurtle() {

        turtle = new Turtle();
        sketchBoard = new SketchBoard();
    }

    @Test
    public void testThatTurtlePenIsUp() {
        assertTrue(turtle.isPenUp());
    }

    @Test
    public void givenTurtlePenIsUp_putPenDown_penIsDownTest() {
        assertTrue(turtle.isPenUp());

        turtle.penDown();
        assertFalse(turtle.isPenUp());
    }

    @Test
    public void givenTurtlePenIsDown_putPenUp_penIsUpTest() {
        turtle.penDown();
        assertFalse(turtle.isPenUp());

        turtle.penUp();
        assertTrue(turtle.isPenUp());
    }

    @Test
    public void testThatTurtleIsFacingEastByDefault() {
        assertSame(EAST, turtle.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeftWhileFacingEast_turtleIsNowFacingNorth() {
        assertSame(EAST, turtle.getCurrentDirection());

        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeftWhileFacingNorth_turtleIsNowFacingWest() {
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());

        turtle.turnLeft();
        assertSame(WEST, turtle.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeftWhileFacingWest_turtleIsNowFacingSouth() {
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(WEST, turtle.getCurrentDirection());

        turtle.turnLeft();
        assertSame(SOUTH, turtle.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeftWhileFacingSouth_turtleIsNowFacingEast() {
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(SOUTH, turtle.getCurrentDirection());

        turtle.turnLeft();
        assertSame(EAST, turtle.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnRightWhileFacingEast_turtleIsNowFacingSouth() {
        assertSame(EAST, turtle.getCurrentDirection());

        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnRightWhileFacingSouth_turtleIsNowFacingWest() {
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());

        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnRightWhileFacingWest_turtleIsNowFacingNorth() {
        turtle.turnRight();
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());

        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnRightWhileFacingNorth_turtleIsNowFacingEast() {
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());

        turtle.turnRight();
        assertSame(EAST, turtle.getCurrentDirection());
    }


    @Test
    void testThatTurtleInitialPositionIsZeroAtRowAndZeroAtColumnWhenTurtleLocationIsEast(){
        assertSame(EAST, turtle.getCurrentDirection());
        assertEquals(new TurtlePosition(0,0), turtle.getCurrentPosition());
    }

    @Test
    void testThatTurtleCanMoveWhenTurtleLocationIsEast(){
        assertSame(EAST, turtle.getCurrentDirection());
        assertEquals(new TurtlePosition(0,0), turtle.getCurrentPosition());

        turtle.moveForward(5, sketchBoard);
        assertEquals(new TurtlePosition(0,4), turtle.getCurrentPosition());

    }

    @Test
    void testThatTurtleCanMoveWhenTurtleLocationIsSouthWhenTurtleCurrentPositionIsZeroAndFour(){
        turtle.moveForward(5, sketchBoard);
        assertEquals(new TurtlePosition(0,4), turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.moveForward(5, sketchBoard);
        assertEquals(new TurtlePosition(4,4), turtle.getCurrentPosition());

    }

    @Test
    void testThatTurtleCanMoveWhenTurtleLocationIsWestAndTurtleCurrentPositionIsFourAndFour(){
        assertSame(EAST, turtle.getCurrentDirection());
        assertEquals(new TurtlePosition(0,0), turtle.getCurrentPosition());
        turtle.moveForward(5, sketchBoard);
        assertEquals(new TurtlePosition(0,4), turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.moveForward(5, sketchBoard);
        assertEquals(new TurtlePosition(4,4), turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.moveForward(5, sketchBoard);
        assertEquals(new TurtlePosition(4,0), turtle.getCurrentPosition());

    }

    @Test
    void testThatTurtleCanMoveWhenTurtleLocationIsNorthAndTurtleCurrentPositionFourAndZero(){
        assertSame(EAST, turtle.getCurrentDirection());
        assertEquals(new TurtlePosition(0,0), turtle.getCurrentPosition());
        turtle.moveForward(5, sketchBoard);
        assertEquals(new TurtlePosition(0,4), turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.moveForward(5, sketchBoard);
        assertEquals(new TurtlePosition(4,4), turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.moveForward(5, sketchBoard);
        assertEquals(new TurtlePosition(4,0), turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());
        turtle.moveForward(5, sketchBoard);
        assertEquals(new TurtlePosition(0,0), turtle.getCurrentPosition());

    }

    @Test
    public void sketchBoardHasSize20by20(){
        int[][] expected = new int[20][20];
        assertArrayEquals(expected, sketchBoard.getBoard());
    }

}
