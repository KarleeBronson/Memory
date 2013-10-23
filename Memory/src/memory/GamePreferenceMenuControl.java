/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

/**
 *
 * @author kbronson
 */
public class GamePreferencesMenuControl {
    
    private Game game;
    
    public GamePreferencesMenuControl(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }
    
    public void setGame(Game game) { //i'm not sure if i need setGame? 
        this.game = game;
    }

    public void shuffleCards(Game game) { 
        this.game = game;
    }
          
    
    public void changeNumberOfMatches(Game game) {
        System.out.println("\n\tChange number of matches");
   
    }
    
     public boolean returnToGameMenu() {

       System.out.println("\n\tReturn to game menu");
       return true;
    }   
    
    
}