/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

/**
 *
 * @author Karalee Olsen
 */
public class Game {
    
    String gameType;
    Player playerA;
    Player playerB;
    Player currentPlayer;
    Player otherPlayer;
    Player winner;
    Player loser;
    String status;
    Board board;
   
   
   public Game() {
       
       this.playerA = new Player();
       this.playerA.name = "";
       this.playerB = new Player();
       this.playerB.name = "";
   }
   
   
   public void displayWinningMessage() {
       System.out.println(
               "\n\t*************************************************************************************************"
               + "\n\t Congratulations " + this.winner.name + "! You found the most matches. You are the Winner"
               + "\n\t Sorry " + this.loser.name + ", You are the loser."
               + "\n\t*************************************************************************************************");
   }
   
   public void displayTiedMessage () {
       System.out.println(
               "\n\t*************************************************************************************************"
               + "\n\t The game is a tie. Better Luck next time!"
               + "******************************************************************************************************");
   }
   
   public void displayPlayer() {
       System.out.println("\n\tHere are the two default players in the game of Memory.");
       this.playerA.displayName();
       this.playerB.displayName();
       
   }
}
