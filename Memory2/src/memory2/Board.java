/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory2;

/**
 *Create Cards, Shuffle cards, Collect cards
 * @author kbronson
 */
public class Board {
 String cardArray[][];       //a two-dimensional array of cards (i.e., the cards laid out face down)
    String whoseTurn = "";     //a variable containing a reference to the Player who's turn is next
    int rowCount;    int columnCount;

    //Location[][] boardLocations;
    public Board() {
    }
   
    public void displayCardArray() {
     String cardArray[][] = {{"CARD1", "CARD2", "CARD3" }, 
            {"CARD4", "CARD5", "CARD6"}};
        System.out.println("These are the cards.\n");
        display(cardArray);
       // System.out.println("\nEnter the number for each card that you would like "
         //       + "to flip over, one at a time. \nFor example : \n2\n6 ");
    }

    public static void display(String x[][]) {
        for (int row = 0; row < x.length; row++) {
            for (int column = 0; column < x[row].length; column++) {
                System.out.print(x[row][column] + "\t");
            }
            System.out.println();
        }
    }

}