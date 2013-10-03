/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

import java.awt.Point;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Karalee Olsen
 */
public class Board {
    // cards - a two-dimensional array of cards (i.e., the cards laid out face down)
    //- turn - a variable containing a reference to the Player who's turn is next
    int cardArray = new.Array;
    int whoseTurn = ;
    int rowCount = 2;
    int columnCount = 5;
    
    Location[][] boardLocations;
    
    
    public Board() {
    }
    
    
    public void displaySize() {
        System.out.println("\n\tThe board is " + this.rowCount + " by "
                            + this.columnCount + " in size.");
    }
    
}
