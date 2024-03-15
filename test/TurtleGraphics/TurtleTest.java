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
    void testThatTurtleInitialPositionIsZeroAtRowAndZeroAtColumnWhenTurtleLocationIsEast() {
        assertSame(EAST, turtle.getCurrentDirection());
        assertEquals(new TurtlePosition(0, 0), turtle.getCurrentPosition());
    }

    @Test
    void testThatTurtleCanMoveWhenTurtleLocationIsEast() {
        assertSame(EAST, turtle.getCurrentDirection());
        assertEquals(new TurtlePosition(0, 0), turtle.getCurrentPosition());

        turtle.moveForward(5, sketchBoard);
        assertEquals(new TurtlePosition(0, 4), turtle.getCurrentPosition());

    }

    @Test
    void testThatTurtleCanMoveWhenTurtleLocationIsSouthWhenTurtleCurrentPositionIsZeroAndFour() {
        turtle.moveForward(5, sketchBoard);
        assertEquals(new TurtlePosition(0, 4), turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.moveForward(5, sketchBoard);
        assertEquals(new TurtlePosition(4, 4), turtle.getCurrentPosition());

    }

    @Test
    void testThatTurtleCanMoveWhenTurtleLocationIsWestAndTurtleCurrentPositionIsFourAndFour() {
        assertSame(EAST, turtle.getCurrentDirection());
        assertEquals(new TurtlePosition(0, 0), turtle.getCurrentPosition());
        turtle.moveForward(5, sketchBoard);
        assertEquals(new TurtlePosition(0, 4), turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.moveForward(5, sketchBoard);
        assertEquals(new TurtlePosition(4, 4), turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.moveForward(5, sketchBoard);
        assertEquals(new TurtlePosition(4, 0), turtle.getCurrentPosition());

    }

    @Test
    void testThatTurtleCanMoveWhenTurtleLocationIsNorthAndTurtleCurrentPositionFourAndZero() {
        assertSame(EAST, turtle.getCurrentDirection());
        assertEquals(new TurtlePosition(0, 0), turtle.getCurrentPosition());
        turtle.moveForward(5, sketchBoard);
        assertEquals(new TurtlePosition(0, 4), turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.moveForward(5, sketchBoard);
        assertEquals(new TurtlePosition(4, 4), turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.moveForward(5, sketchBoard);
        assertEquals(new TurtlePosition(4, 0), turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());
        turtle.moveForward(5, sketchBoard);
        assertEquals(new TurtlePosition(0, 0), turtle.getCurrentPosition());

    }

    @Test
    public void sketchBoardHasSize20by20() {
        int[][] expected = new int[20][20];
        assertArrayEquals(expected, sketchBoard.getBoard());
    }

    @Test
    public void penIsUp_turtleMoveTenTimes_scoreBoardNotMarked() {
        assertTrue(turtle.isPenUp());
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.moveForward(5, sketchBoard);
        assertEquals(new TurtlePosition(0, 4), turtle.getCurrentPosition());
        int[][] expected = sketchBoard.getBoard();
        assertEquals(0, expected[0][0]);
        assertEquals(0, expected[0][1]);
        assertEquals(0, expected[0][2]);
        assertEquals(0, expected[0][3]);
        assertEquals(0, expected[0][4]);
        assertEquals(0, expected[0][5]);
        assertEquals(0, expected[0][6]);
        assertEquals(0, expected[0][7]);
        assertEquals(0, expected[0][8]);
        assertEquals(0, expected[0][9]);

    }


    @Test
    public void penIsDown_turtleMoveFiveTimesViaEast_scoreBoardIsMarked(){
        assertTrue(turtle.isPenUp());
        turtle.penDown();
        assertFalse(turtle.isPenUp());
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.moveForward(5, sketchBoard);
        assertEquals(new TurtlePosition(0,4), turtle.getCurrentPosition());
        int[][] expected = sketchBoard.getBoard();
        assertEquals(1, expected[0][0]);
        assertEquals(1, expected[0][1]);
        assertEquals(1, expected[0][2]);
        assertEquals(1, expected[0][3]);
        assertEquals(1, expected[0][4]);
    }


    @Test
    public void penIsDown_turtleMoveFiveTimesViaSouth_scoreBoardIsMarked(){
        assertTrue(turtle.isPenUp());
        turtle.penDown();
        assertFalse(turtle.isPenUp());
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.moveForward(5, sketchBoard);
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.moveForward(5, sketchBoard);
        assertEquals(new TurtlePosition(4,4), turtle.getCurrentPosition());
        int[][] expected = sketchBoard.getBoard();
        assertEquals(1, expected[0][4]);
        assertEquals(1, expected[1][4]);
        assertEquals(1, expected[2][4]);
        assertEquals(1, expected[3][4]);
        assertEquals(1, expected[4][4]);
    }

    @Test
    public void penIsDown_turtleMoveTwoTimesViaWest_scoreBoardIsMarked(){
        assertTrue(turtle.isPenUp());
        turtle.penDown();
        assertFalse(turtle.isPenUp());
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.moveForward(2, sketchBoard);
        assertEquals(new TurtlePosition(0,1), turtle.getCurrentPosition());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.moveForward(2, sketchBoard);
        assertEquals(new TurtlePosition(1,1), turtle.getCurrentPosition());
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.moveForward(2, sketchBoard);

        assertEquals(new TurtlePosition(1,0), turtle.getCurrentPosition());
        int[][] expected = sketchBoard.getBoard();
        assertEquals(1, expected[1][0]);
        assertEquals(1, expected[1][1]);
    }


    @Test
    public void penIsDown_turtleMoveTwoTimesViaNorth_scoreBoardIsMarked(){
        assertTrue(turtle.isPenUp());
        turtle.penDown();
        assertFalse(turtle.isPenUp());
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.moveForward(2, sketchBoard);
        assertEquals(new TurtlePosition(0,1), turtle.getCurrentPosition());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.moveForward(2, sketchBoard);
        assertEquals(new TurtlePosition(1,1), turtle.getCurrentPosition());
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.moveForward(2, sketchBoard);
        assertEquals(new TurtlePosition(1,0), turtle.getCurrentPosition());
        turtle.turnRight();
        assertEquals(NORTH, turtle.getCurrentDirection());
        turtle.moveForward(2, sketchBoard);
        assertEquals(new TurtlePosition(0,0), turtle.getCurrentPosition());



        int[][] expected = sketchBoard.getBoard();
        assertEquals(1, expected[0][0]);
        assertEquals(1, expected[0][1]);
    }


    @Test
    public void turtleGraphicCanDisplayWithHash(){
        turtle.penDown();
        turtle.moveForward(5, sketchBoard);
        sketchBoard.displayBoard();
    }

    @Test
    public void turtleGraphicCanSquareWithHash(){
        turtle.penDown();
        turtle.moveForward(20, sketchBoard);
        turtle.turnRight();
        turtle.moveForward(20, sketchBoard);
        turtle.turnRight();
        turtle.moveForward(20, sketchBoard);
        turtle.turnRight();
        turtle.moveForward(20, sketchBoard);
        sketchBoard.displayBoard();
    }




}
