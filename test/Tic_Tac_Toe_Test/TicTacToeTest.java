package Tic_Tac_Toe_Test;

import Exceptions.CellOccupiedException;
import Exceptions.InvalidUserIDException;
import Exceptions.NullGameTypeException;
import Tic_Tac_Toe.GameType;
import Tic_Tac_Toe.TicTacToe;
import Tic_Tac_Toe.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {

    @Test
    public void testThatCreationOfMyTicTacToeGameWithTwoPlayersIsValid() {
        User player1 = new User(1, GameType.X);
        User player2 = new User(2, GameType.O);

        TicTacToe myGame = new TicTacToe(player1, player2);
        assertArrayEquals(new User[]{player1, player2}, myGame.getPlayers());

    }

    @Test
    public void testToEnsureThatTheGameHasAScoreBoardThatIsInitializedCorrectlyWithAnEmptySomething() {

        User player1 = new User(1, GameType.X);
        User player2 = new User(2, GameType.O);
        TicTacToe myGame = new TicTacToe(player1, player2);

        GameType[][] expectedScoreBoard = new GameType[][]{
                {GameType.EMPTY, GameType.EMPTY, GameType.EMPTY},
                {GameType.EMPTY, GameType.EMPTY, GameType.EMPTY},
                {GameType.EMPTY, GameType.EMPTY, GameType.EMPTY}
        };
        assertArrayEquals(expectedScoreBoard, myGame.getScoreBoard());
    }

    @Test
    public void testThatICanGetCurrentPlayer() {
        User player1 = new User(1, GameType.X);
        User player2 = new User(2, GameType.O);
        TicTacToe myGame = new TicTacToe(player1, player2);
        assertEquals(player1, myGame.getCurrentPlayer());

        GameType[][] expectedScoreBoard = new GameType[][]{
                {GameType.EMPTY, GameType.EMPTY, GameType.EMPTY},
                {GameType.EMPTY, GameType.EMPTY, GameType.EMPTY},
                {GameType.EMPTY, GameType.EMPTY, GameType.EMPTY}
        };
        assertArrayEquals(expectedScoreBoard, myGame.getScoreBoard());

        myGame.makeMove(1, 0);
        assertEquals(player2, myGame.getCurrentPlayer());
    }

    @Test
    public void testThatAPlayerCanNotPlayInACellThatIsAlreadyOccupied() {
        User player1 = new User(1, GameType.X);
        User player2 = new User(2, GameType.O);
        TicTacToe myGame = new TicTacToe(player1, player2);
        assertEquals(player1, myGame.getCurrentPlayer());

        GameType[][] expectedScoreBoard = new GameType[][]{
                {GameType.EMPTY, GameType.EMPTY, GameType.EMPTY},
                {GameType.EMPTY, GameType.EMPTY, GameType.EMPTY},
                {GameType.EMPTY, GameType.EMPTY, GameType.EMPTY}
        };

        assertArrayEquals(expectedScoreBoard, myGame.getScoreBoard());

        myGame.makeMove(1, 0);
        assertEquals(player2, myGame.getCurrentPlayer());
        myGame.makeMove(2, 1);
        assertEquals(player1, myGame.getCurrentPlayer());
        assertThrows(CellOccupiedException.class, () -> myGame.makeMove(2, 1));

    }

    @Test
    public void testConstructorWithNullGameType() {
        assertThrows(NullGameTypeException.class, () -> new User(1, null));

    }

    @Test
    public void testThatConstructorWithInvalidUserIdException() {
        assertThrows(InvalidUserIDException.class, () -> new User(-1, GameType.X));

    }

    @Test
    public void testWinningScenarioWithPlayer1() {
        User player1 = new User(1, GameType.X);
        User player2 = new User(2, GameType.O);
        TicTacToe myGame = new TicTacToe(player1, player2);

        GameType[][] expectedScoreBoard = new GameType[][]{
                {GameType.EMPTY, GameType.EMPTY, GameType.EMPTY},
                {GameType.EMPTY, GameType.EMPTY, GameType.EMPTY},
                {GameType.EMPTY, GameType.EMPTY, GameType.EMPTY}
        };
        assertArrayEquals(expectedScoreBoard, myGame.getScoreBoard());

        player1.playGame(myGame, 0, 0);
        player2.playGame(myGame, 1, 0);
        player1.playGame(myGame, 0, 1);
        player2.playGame(myGame, 1, 1);
        player1.playGame(myGame, 0, 2);

        assertEquals(player1, myGame.getWinner());

    }


    @Test
    public void testWinningScenarioWithPlayer2() {
        User player1 = new User(1, GameType.X);
        User player2 = new User(2, GameType.O);
        TicTacToe myGame = new TicTacToe(player1, player2);

        GameType[][] expectedScoreBoard = new GameType[][]{
                {GameType.EMPTY, GameType.EMPTY, GameType.EMPTY},
                {GameType.EMPTY, GameType.EMPTY, GameType.EMPTY},
                {GameType.EMPTY, GameType.EMPTY, GameType.EMPTY}
        };
        assertArrayEquals(expectedScoreBoard, myGame.getScoreBoard());

        player1.playGame(myGame, 1, 0);
        player2.playGame(myGame, 0, 0);
        player1.playGame(myGame, 1, 1);
        player2.playGame(myGame, 0, 1);
        player1.playGame(myGame, 2, 2);
        player2.playGame(myGame, 0, 2);


        assertEquals(player2, myGame.getWinner());

    }

    @Test
    public void testDrawScenario() {
        User player1 = new User(1, GameType.X);
        User player2 = new User(2, GameType.O);
        TicTacToe myGame = new TicTacToe(player1, player2);

        player1.playGame(myGame, 0, 0);
        player2.playGame(myGame, 1, 0);
        player1.playGame(myGame, 0, 1);
        player2.playGame(myGame, 1, 1);
        player1.playGame(myGame, 2, 2);
        player2.playGame(myGame, 2, 0);
        player1.playGame(myGame, 1, 2);
        player2.playGame(myGame, 0, 2);
        player1.playGame(myGame, 2, 1);

        assertTrue(myGame.isDraw());
    }

    @Test
    public void testNegativeRowValue() {
        User player1 = new User(1, GameType.X);
        User player2 = new User(2, GameType.O);
        TicTacToe myGame = new TicTacToe(player1, player2);

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> myGame.makeMove(-1, 0));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> myGame.makeMove(-3, 0));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> myGame.makeMove(-9, 0));

    }

    @Test
    public void testNegativeColumnValue() {
        User player1 = new User(1, GameType.X);
        User player2 = new User(2, GameType.O);
        TicTacToe myGame = new TicTacToe(player1, player2);

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> myGame.makeMove(1, -1));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> myGame.makeMove(1, -3));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> myGame.makeMove(1, -7));

    }
    @Test
    public void testPositiveRowValueCanNotBeGreaterThanOrEqualToThree() {
        User player1 = new User(1, GameType.X);
        User player2 = new User(2, GameType.O);
        TicTacToe myGame = new TicTacToe(player1, player2);

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> myGame.makeMove(3, 0));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> myGame.makeMove(4, 0));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> myGame.makeMove(7, 0));

    }

    @Test
    public void testPositiveColumnValueCanNotBeGreaterThanOrEqualToThree() {
        User player1 = new User(1, GameType.X);
        User player2 = new User(2, GameType.O);
        TicTacToe myGame = new TicTacToe(player1, player2);

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> myGame.makeMove(0, 3));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> myGame.makeMove(0, 4));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> myGame.makeMove(0, 5));


    }
    @Test
    public void testToEnsureTheGameStateRemainsUnchanged() {
        User player1 = new User(1, GameType.X);
        User player2 = new User(2, GameType.O);
        TicTacToe myGame = new TicTacToe(player1, player2);

        player1.playGame(myGame, 0, 0);
        player2.playGame(myGame, 1, 0);
        player1.playGame(myGame, 0, 1);
        player2.playGame(myGame, 1, 1);

        assertEquals(GameType.EMPTY, myGame.getScoreBoard()[2][2]);

    }
}
