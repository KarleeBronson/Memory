/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memorygame;

import java.util.Scanner;

/**
 *
 * @author kbronson
 */
public class MemoryGame{
    String name; 
    String instructions = "This is the game of Memory \n\n"
            + "There will be a total of 2 players.\n\n"
            + "Each player will take a turn choosing 1 card at a time.\n\n"
            + "By clicking on a card with the arrow, card will flip over.\n\n"  
            + "The object of the game is to find the cards match.\n\n"
            + "The player continues until they can't find a match.\n\n"
            + "The player who gets the most matches wins.\n\n";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MemoryGame myGame = new MemoryGame();
        myGame.getName();
        myGame.displayHelp();
        // TODO code application logic here
        Card myCard = new Card();
        myCard.displayCard();
        
        
    }
    public void getName() {
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter your name:");
        this.name = input.next ();
    }
    
    public void displayHelp (){
    System.out.println("Welcome " + this.name + "");    
    System.out.println(this.instructions);
    
    }