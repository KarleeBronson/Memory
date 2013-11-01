/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

import java.util.Scanner;

/**
 *
 * @author Karalee Olsen
 * Karlee Bronson
 */
public class HelpMenuView {

    private final static String[][] menuItems = {
        {"B", "The board"},
        {"C", "A computer player"},
        {"CC", "Collect Cards"
        {"G", "The Memory game"},
        {"D", "A Flipped Down Card"},
        {"U", "A Flipped Up Card"},
        {"R", "A regular player"},
        {"S", "Shuffle Cards"},
        {"Q", "Quit Help"}
    };
    // Create instance of the HelpMenuControl (action) class
    private HelpMenuControl helpMenuControl = new HelpMenuControl();

    // default constructor
    public HelpMenuView() {
    }

    // display the help menu and get the end users input selection
    public String getInput() {

        String gameStatus = Game.PLAYING; 
        do {
            this.display();

            // get commaned entered
            String command = this.getCommand();
            switch (command) {
                case "B":
                    this.helpMenuControl.displayBoardHelp();
                    break;
                case "C":
                    this.helpMenuControl.displayComputerPlayerHelp();
                    break;
                case "CC":
                    this.helpMenuControl.displayCollectCardHelp();
                    break;
                case "G":
                    this.helpMenuControl.displayGameHelp();
                    break;
                case "D":
                    this.helpMenuControl.displayFlippedDownCardHelp();
                    break;
                case "U":
                    this.helpMenuControl.displayFlippedUpCardHelp();
                    break;
                case "R":
                    this.helpMenuControl.displayRealPlayerHelp();
                    break;
                case "S";
                    this.helpMenuControl.displayShuffleCardsHelp();
                case "Q":
                    return "QUIT";
            }
        } while (!gameStatus.equals("QUIT"));

        return gameStatus;
    }

    // displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < HelpMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

    // retrieves the command entered by the end user
    protected final String getCommand() {

        Scanner inFile = Memory.getInputFile(); // create like in the tictactoe example on the main class
        String command;
        boolean valid = false;
        do {

            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            valid = validCommand(command);
            if (!validCommand(command)) {
                new MemoryError().displayError("Invalid command. Please enter a valid command."); 
                continue;
            }

        } while (!valid);

        return command;
    }

    // determines if the command is valid
    private boolean validCommand(String command) {
        String[][] items = HelpMenuView.menuItems;

        for (String[] item : HelpMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
}
