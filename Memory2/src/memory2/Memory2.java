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
        // TODO code application logic here
        
    

public static void main(String[] args) throws IOException {
        Memory2 myGame = new Memory2();
       
        myGame.displayHelp(); 
        public static final Scanner inFile = new Scanner(System.in);
        //public static final HelpMenuView helpMenu = new HelpMenuView();
    
        public static Scanner getInputFile() {
            return Memory2.inFile;
    }

        //public static HelpMenuView getHelpMenu() {
        //   return Memory2.helpMenu;
        //}

        CardMenuControl myCard = new CardMenuControl();
        myCard.displayCardMenuControl();
        

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
     
        //HelpMenu myHelpMenu = new HelpMenu();
       // myHelpMenu.displayHelpMenu();

    
    public void displayHelp() {
        System.out.println("Welcome player A and Player B \n");
        System.out.println(this.instructions);
}
}
