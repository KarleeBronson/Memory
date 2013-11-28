/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author kbronson
 */
public class Memory2 {

    public static String instructions = "This is the game of Memory. \n"
            + "There will be a total of 2 players.\n"
            + "Each player will take a turn choosing 1 card at a time.\n"
            + "By clicking on a card with the arrow, card will flip over.\n"
            + "The object of the game is to find the cards match.\n"
            + "The player continues until they can't find a match.\n"
            + "The player who gets the most matches wins.\n\n"
            + "========================================================================\n";
    public static final Scanner inFile = new Scanner(System.in);
    public static final CardMenuView cardMenu = new CardMenuView();
    //public static final HelpMenuView helpMenu = new HelpMenuView();

    public Memory2() {
    }

    public static String getInstructions() {
        return instructions;
    }

    public static void setInstructions(String instructions) {
        Memory2.instructions = instructions;
    }

    public static Scanner getInputFile() {
        return Memory2.inFile;
    }

    public static CardMenuView getCardMenu() {
        return Memory2.cardMenu;
    }

    //public static HelpMenuView getHelpMenu() {
    //   return Memory2.helpMenu;
    //}
    public static void main(String[] args) throws IOException {

        Memory2 myGame = new Memory2();
        myGame.displayHelp();
        
        MainMenuView mainMenuView = new MainMenuView();
        GameStatus input = mainMenuView.getInput(myGame);//not otherwise compatable

        Game newGame = new Game();
        newGame.displayGameStatus();
        //newGame.start();
        //newGame.displayGame();
        //newGame.displayTiedMessage();
        //Board myBoard = new Board();
        //myBoard.displayCardArray();
        //myBoard.displayCardArray();
        //myBoard.displayWhoseTurn();  

        /* Player myPlayer = new Player();
         myPlayer.getName();
         myPlayer.displayName();
         myPlayer.displayPoints();
         myPlayer.getWinnerLoser();
         */
        //HelpMenu myHelpMenu = new HelpMenu();
        // myHelpMenu.displayHelpMenu();

    }

    public void displayHelp() {
        System.out.println("Welcome player A and Player B \n");
        System.out.println(Memory2.instructions);
    }
}
