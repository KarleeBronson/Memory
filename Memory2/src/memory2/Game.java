/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory2;

import java.io.Serializable;

/**
 * Start game, end game, respond to catd selection
 *
 * @author kbronson
 */
public class Game implements Serializable {
    //public static final String START_GAME = "START_GAME";

 //   public static final String PLAYING = "PLAYING";
  //  public static final String QUIT = "QUIT";

    // public String status;
    //Player playerA;
    //Player PlayerB;
    public Game() {
        // Board myBoard = new Board();
        // myBoard.displayCardArray();
        //myBoard.displayCardArray();
        //myBoard.displayWhoseTurn();  
        //CardMenuView cardMenuView = new CardMenuView();
        //cardMenuView.display();
        /* Player myPlayer = new Player();
         myPlayer.getName();
         myPlayer.displayName();
         myPlayer.displayPoints();
         myPlayer.getWinnerLoser();
         }*/
        // we need this and some of the other methods in game, or we need to write loops to make our card menu loop.
        //public void start(){
        //while{status.equals = Game.PLAYING;
        // }
        //public void quit(){
        //status = Game.QUIT;
        //} 
    }
    
    
    public void displayWinningMessage() {
        System.out.println(
                "\n\t*************************************************************************************************"
                + "\n\t Congratulations! You found the most matches. You are the Winner"
                + "\n\t Sorry, You are the loser."
                + "\n\t*************************************************************************************************");
    }

    public void displayTiedMessage() {
        System.out.println(
                "\n\t*************************************************************************************************"
                + "\n\t The game is a tie. Better Luck next time!"
                + "\n\t******************************************************************************************************");
    }
}