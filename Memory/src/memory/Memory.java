/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

import java.util.Scanner;

/**
 *
 * @author kbronson
 */
public class Memory {
    String name;
    String name2;
    String instructions =  "This is the game of Memory \n\n"
            + "There will be a total of 2 players.\n\n"
            + "Each player will take a turn choosing 1 card at a time.\n\n"
            + "By clicking on a card with the arrow, card will flip over.\n\n"  
            + "The object of the game is to find the cards match.\n\n"
            + "The player continues until they can't find a match.\n\n"
            + "The player who gets the most matches wins.\n\n";
           
    /**     
     * 
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        Memory myGame = new Memory();
        myGame.getName();
        myGame.displayHelp();
        // TODO code application logic here
        Card myCard = new Card();
        myCard.displayCard();
        myCard.displayPossibleMatches();
        myCard.displayRoundScores();
        Game newGame = new Game();
        newGame.displayGame();
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
        HelpMenu myHelpMenu= new HelpMenu();
        myHelpMenu.displayHelpMenu();
        //myPlayer.getName();
        // I think we should change this to the getName() 
        //function that was created when I did the insert 
        //"getter setter" thing that we were told to do in
        // one of the videos last week. (The getter setter 
        // thing is what input a lot of code without us 
        // needing to input it. Almost any of the code that 
        //says has a get function and then a set function was created by NetBeans.
        Pair myPair = new Pair();
        myPair.displayCardType();
        Location myLocation = new Location();
        myLocation.displayFlippedCard();
        myPlayer.displayNumberOfPairsWon();
        myPlayer.getWinnerLoser ();
    }
    public void getName() {
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter your name Player A:");
        this.name = input.next ();
        System.out.println ("Enter your name Player B:");
        this.name2 = input.next ();
        
    }
    
    public void displayHelp (){
    System.out.println("Welcome " + this.name + " and " + this.name2 + ",\n");    
    System.out.println(this.instructions);
    
    }}
            
      
