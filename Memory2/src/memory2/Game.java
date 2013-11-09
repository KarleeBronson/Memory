/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory2;

/**
 *
 * @author kbronson
 */
public class Game {
    
    public static final String QUIT = "QUIT";
    public static final String PLAYING = "PLAYING";
    
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