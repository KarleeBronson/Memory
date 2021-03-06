/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

import java.awt.Point;

/**
 *
 * @author Karalee Foster
 */
public class GameMenuControl {

    private Game game;
    private Board board;
    //private GetLocationView getLocation = new GetLocationView();    // add if needed
    private BoardView displayBoard = new BoardView();

    public GameMenuControl(Game game) {
        this.game = game;
        this.board = game.getBoard();

    }

    public void takeTurn() {
        System.out.println("\n\ttakeTurn() called");
    }

    public void displayBoard() {
        System.out.println("\n\tdisplayBoard() called");
    }

    public void startNewGame() {
        System.out.println("\n\tstartNewGame() called");
        this.displayBoard();
    }

   public void displayPreferencesMenu() {
        GamePreferencesMenuView gamePreferencesMenuView = new GamePreferencesMenuView(this.game);
        gamePreferencesMenuView.getInput();
    }

    public void displayStatistics() {
        String playerAStatistics = this.game.getPlayerA().getPlayerStastics();
        String playerBStatistics = this.game.getPlayerB().getPlayerStastics();
        System.out.println("\n\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\t " + playerAStatistics);
        System.out.println("\n\t " + playerBStatistics);
        System.out.println("\t+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public void displayHelpMenu() {
        HelpMenuView helpMenu = Memory.getHelpMenu();
        helpMenu.getInput();
    }
}
