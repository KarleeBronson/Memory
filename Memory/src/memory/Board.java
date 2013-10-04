package memory;

/**
 *
 * @author Karalee Olsen
 */
public class Board {
    
    int [] cardArray;       //a two-dimensional array of cards (i.e., the cards laid out face down)
    String whoseTurn = "";     //a variable containing a reference to the Player who's turn is next
    int rowCount = 2;
    int columnCount = 5;
    
    Location[][] boardLocations;
    
    public static void main(String[] args) {
    
    }
    public Board() {
    }
    
    
    public void displayCardArray() {
        System.out.println("\n\t The cards are " + this.cardArray + " .");
    }
    
    
    public void displayWhoseTurn(){
        System.out.println("\n\t It is " + this.whoseTurn + " turn to find a match.");
    }
    
    
    public void displaySize() {
        System.out.println("\n\tThe board is " + this.rowCount + " by "
                            + this.columnCount + " in size.");
    }
    
}
