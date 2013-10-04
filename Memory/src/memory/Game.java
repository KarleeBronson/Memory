/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

import java.io.Serializable;

/**
 *
 * @author Karalee Olsen
 */
public class Game implements Serializable{
    
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

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public Player getPlayerA() {
        return playerA;
    }

    public void setPlayerA(Player playerA) {
        this.playerA = playerA;
    }

    public Player getPlayerB() {
        return playerB;
    }

    public void setPlayerB(Player playerB) {
        this.playerB = playerB;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public Player getOtherPlayer() {
        return otherPlayer;
    }

    public void setOtherPlayer(Player otherPlayer) {
        this.otherPlayer = otherPlayer;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Player getLoser() {
        return loser;
    }

    public void setLoser(Player loser) {
        this.loser = loser;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
   
}
