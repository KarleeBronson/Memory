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
    
    int rowCount = 3;
    int columnCount = 3;
    
    Location[][] boardLocations;
    
    
    public Board() {
    }
    
    
    public void displaySize() {
        System.out.println("\n\tThe board is " + this.rowCount + " by "
                            + this.columnCount + " in size.");
    }
    
}
