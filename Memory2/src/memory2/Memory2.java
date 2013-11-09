/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author kbronson
 */
public class Memory2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

public static void main(String[] args) throws IOException {
        Memory2 myGame = new Memory2();
        myGame.getName();
        myGame.displayHelp();

        CardMenuControl myCard = new CardMenuControl();
        myCard.displayCardMenuControl();
        myCard.displayPossibleMatches();
        //myCard.displayRoundScores();

        Game newGame = new Game();
        //newGame.displayGame();
        //newGame.displayTiedMessage();
        Board myBoard = new Board();
        //myBoard.displayCardArray();
        //myBoard.displayWhoseTurn();
        

        Player myPlayer = new Player();
        myPlayer.displayName();
        myPlayer.displayPoints();
        myPlayer.getWinnerLoser();
        
     
        

        HelpMenu myHelpMenu = new HelpMenu();
        myHelpMenu.displayHelpMenu();

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
}
