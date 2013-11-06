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
public class Game implements Serializable {

    public static final String ONE_PLAYER = "ONE_PLAYER";
    public static final String TWO_PLAYER = "TWO_PLAYER";
    public static final String CONTINUE = "CONTINUE";
    public static final String NEW_GAME = "NEW_GAME";
    public static final String PLAYING = "PLAYING";
    public static final String WINNER = "WINNER";
    public static final String TIE = "TIE";
    public static final String QUIT = "QUIT";
    public static final String ERROR = "ERROR";
    public static final String EXIT = "EXIT";
   
    public String gameType;
    public Player playerA;
    public Player playerB;
    public Player currentPlayer;
    public Player otherPlayer;
    public Player winner;
    public Player loser;
    public String status;
    Board board;

    public Game() {
//put into player class
        this.playerA = new Player();
        //this.playerA.name = "";       not needed?
        this.playerB = new Player();
        //this.playerB.name = "";       not needed?
    }

    public Game(String gameType) {
        this();

        this.gameType = gameType;
        this.board = new Board();

    }
    /*public void displayGame(){
     System.out.println(this.playerA.name + " is Player A. " 
     + this.playerB.name + " is Player B. " );
     }
     * Not needed?
     */

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

    public void displayWinningMessage() {
        System.out.println(
                "\n\t*************************************************************************************************"
                + "\n\t Congratulations " + this.winner.name + "! You found the most matches. You are the Winner"
                + "\n\t Sorry " + this.loser.name + ", You are the loser."
                + "\n\t*************************************************************************************************");
    }

    public void displayTiedMessage() {
        System.out.println(
                "\n\t*************************************************************************************************"
                + "\n\t The game is a tie. Better Luck next time!"
                + "\n\t******************************************************************************************************");
    }

    Game shuffleCards() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Game changeNumberOfMatches() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
