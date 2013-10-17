/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author kbronson
 */
public class Memory {

    private static final Scanner inFile = new Scanner(System.in);
    private static final HelpMenuView helpMenu = new HelpMenuView();
    //private static String[] nameList;
    /* private final static String WELCOME =
     "Welcome! This is the game of Memory \n\n"
     + "There will be a total of 2 players.\n\n"
     + "Each player will take a turn choosing 1 card at a time.\n\n"
     + "By clicking on a card with the arrow, card will flip over.\n\n"  
     + "The object of the game is to find the cards match.\n\n"
     + "The player continues until they can't find a match.\n\n"
     + "The player who gets the most matches wins.\n\n";
     */
    String name;
    String name2;
    String instructions = "This is the game of Memory \n\n"
            + "There will be a total of 2 players.\n\n"
            + "Each player will take a turn choosing 1 card at a time.\n\n"
            + "By clicking on a card with the arrow, card will flip over.\n\n"
            + "The object of the game is to find the cards match.\n\n"
            + "The player continues until they can't find a match.\n\n"
            + "The player who gets the most matches wins.\n\n";

    public Memory() {
    }

    public static Scanner getInputFile() {
        return Memory.inFile;
    }

    public static HelpMenuView getHelpMenu() {
        return Memory.helpMenu;
    }
    /*public static String[] getNameList() {
     return nameList;
     }

     public static void setNameList(String[] nameList) {
     TicTacToe.nameList = nameList;
     */

    /**
     *
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) throws IOException {
        Memory myGame = new Memory();
        myGame.getName();
        myGame.displayHelp();

        MainMenuView mainMenu = new MainMenuView();
        mainMenu.getInput(null);
        Memory.inFile.close();
        // TODO code application logic here
        
        GameMenuView gameMenuView = new GameMenuView();
        
        Card myCard = new Card();
        myCard.displayCard();
        myCard.displayPossibleMatches();
        //myCard.displayRoundScores();

        Game newGame = new Game();
        //newGame.displayGame();
        //newGame.displayTiedMessage();
        Board myBoard = new Board();
        myBoard.displaySize();
        //myBoard.displayCardArray();
        //myBoard.displayWhoseTurn();
        Tool myTool = new Tool();
        myTool.displayTool();

        Player myPlayer = new Player();
        myPlayer.displayName();
        myPlayer.displayWinningPercentage();
        myPlayer.displayNumberOfPairsWon();
        myPlayer.getWinnerLoser();

        HelpMenu myHelpMenu = new HelpMenu();
        myHelpMenu.displayHelpMenu();

        Pair myPair = new Pair();
        //myPair.displayCardType();

        Location myLocation = new Location();
        myLocation.displayFlippedCard();

    }

    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name Player A:");
        this.name = input.next();
        System.out.println("Enter your name Player B:");
        this.name2 = input.next();

    }

    public void displayHelp() {
        System.out.println("Welcome " + this.name + " and " + this.name2 + ",\n");
        System.out.println(this.instructions);

    }
    //private void display() {
    // System.out.println(Memory.WELCOME);
    //}
}
