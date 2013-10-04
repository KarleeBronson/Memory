/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

/**
 *
 * @author Karalee Olsen
 */
public class Location {
    int row;
    int column;
    Player player;
    
    
    public Location() {
        
    }
    
    public void occupyLocation(Player player){
        this.player = player;
    }
    
    public void displayFlippedCard() {
        if (this.player != null) {
            System.out.println(this.player.flippedCard);
        }
        else {
            System.out.println(" ");
        }
    }
        }
    
}
