package memory;

import java.io.Serializable;
import java.util.Scanner;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Karalee Olsen
 */
public class Board implements Serializable {

    String cardArray[] = new String[16];       //a two-dimensional array of cards (i.e., the cards laid out face down)
    String whoseTurn = "";     //a variable containing a reference to the Player who's turn is next
    int rowCount;
    int columnCount = 5;

    //Location[][] boardLocations;
    public Board() {
    }

    /*  
     //Displays the array of cards 
     public void displayCardArray() {
     cardArray = ;
     char i = 0;
     int d = i;
     for(d = 0; d<10; d++) {
     System.out.print(cardArray[d] + " ");
     }
     System.out.println("\n The cards are " + this.cardArray + " .");
     System.out.print("\n");
       
     }*/
    // displays whose turn it is.
    public void displayWhoseTurn() {
        System.out.println("\n It is " + this.whoseTurn + " turn to find a match.");
    }
    // displays the size of the board

    public void displaySize() {
        System.out.println("\nThe board is " + this.rowCount + " by "
                + this.columnCount + " in size.");
    }

    public char[] getCardArray() {
        return cardArray;
    }

    public void setCardArray(char[] cardArray) {
        this.cardArray = cardArray;
    }

    public String getWhoseTurn() {

        return whoseTurn;
    }

    public void setWhoseTurn(String whoseTurn) {

        this.whoseTurn = whoseTurn;
    }

    public int getRowCount() {
        rowCount = 5;
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        columnCount = 2;
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    /*public Location[][] getBoardLocations() {
     return boardLocations;
     }

     public void setBoardLocations(Location[][] boardLocations) {
     this.boardLocations = boardLocations;
     }
     */
    public final void cardTableArray() {
        int t, i;
        int cardTable[][] = new int[4][4];
        System.out.println("Pick a card to flip over by typing the number of the card you want to view");
        for (t = 0; t < 4; ++t) {
            for (i = 0; i < 4; ++i) {
                cardTable[t][i] = (t * 4) + i + 1;
                System.out.print("|\t" + cardTable[t][i] + "\t|");
            }
            System.out.println();
        }
    }
    private final static String[][] cardMatches = { //this section will list the matches 
    };

    // displays the card matches
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < Board.cardMatches.length; i++) {
            System.out.println("\t   " + cardMatches[i][0] + "\t" + cardMatches[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

    /**
     *
     * @return
     */
    public String collectCards() {

        String gameStatus = Game.PLAYING;

        this.display();
        // get commands entered
        String command = this.getCommand();

        int matched;
        for (matched = 0; matched >= Board.cardMatches.length; matched++) {
            if ("CC".equals(command)) {
                System.out.println("\t   A match has been added to your pile. ");
            }
        }
        return null;

    }

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
        String[][] items = Board.cardMatches;

        for (String[] item : Board.cardMatches) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
}
