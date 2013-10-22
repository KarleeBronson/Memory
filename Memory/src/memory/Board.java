package memory;

import java.io.Serializable;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Karalee Olsen
 */
public class Board implements Serializable {

    char[] cardArray = new char[];       //a two-dimensional array of cards (i.e., the cards laid out face down)
    //String whoseTurn = "";     //a variable containing a reference to the Player who's turn is next
    int rowCount;
    int columnCount = 5;
    //Location[][] boardLocations;

       public Board(){
        
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

   /* public String getWhoseTurn() {
        
        return whoseTurn;
    }

    public void setWhoseTurn(String whoseTurn) {
        
        this.whoseTurn = whoseTurn;
    }
*/
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
    
}
