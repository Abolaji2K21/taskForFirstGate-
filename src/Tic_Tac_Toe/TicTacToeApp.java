package Tic_Tac_Toe;

import Exceptions.CellOccupiedException;
import Exceptions.NullGameTypeException;

import javax.swing.*;
import java.awt.*;

public class TicTacToeApp {

    private TicTacToe myGame;

    public TicTacToeApp() {
        User player1 = new User(1, GameType.X);
        User player2 = new User(2, GameType.O);
        myGame = new TicTacToe(player1, player2);
    }

    private static void print(String prompt) {
        JOptionPane.showMessageDialog(null, prompt);
    }
    private static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }


    public static void welcome() {
        print("Welcome To GameByBe_Jay\n");
        print("The next page Displays, Shows And Help You With Your Choice ?\n");
    }
    public static void displayBoard(GameType[][] scoreBoard) {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(" " + scoreBoard[row][column].toString() + " ");
                if (column < 2) {
                    System.out.print("|");

                }
            }
            System.out.println();
            if (row < 2) {
                System.out.println("---------------------");

            }
        }
        System.out.println();
        System.out.println("=============");
    }

    public static void mainApp() {
        TicTacToeApp app = new TicTacToeApp();
        welcome();
        displayBoard(app.myGame.getScoreBoard());

        while (!app.myGame.isGameOver()) {
            int row = -1;
            int column = -1;
            try {
                row = Integer.parseInt(input("Enter Row (0 - 2): "));
                column = Integer.parseInt(input("Enter Column (0 - 2): "));
                if (row < 0 || row > 2 || column < 0 || column > 2) {
                    print("Invalid input. Row and column values must be between 0 and 2.");
                    continue;
                }
                app.myGame.makeMove(row, column);
                displayBoard(app.myGame.getScoreBoard());
            } catch (NumberFormatException e) {
                print("Invalid input. Please enter numeric values for row and column.");
            } catch (CellOccupiedException e) {
                print("Cell at row " + row + ", column " + column + " is already occupied. Please try again.");
            } catch (NullGameTypeException e) {
                print("Invalid game type. Please ensure all game types are set.");
            }
        }

        User winner = app.myGame.getWinner();
        if (winner != null) {
            print("Player " + winner.getId() + " wins!");
        } else {
            print("It's a draw!");
        }
    }



    public static void main(String[] args) {
        mainApp();
    }


}

