package memory;

import java.io.Serializable;
/**
 *
 * @author Karalee Olsen
 */
public class Card implements Serializable{
    int starPicture;         //a variable for the word, number, or picture on the card
    int starColor;
    
    public void Card(){
    }

    public int getStarPicture() {
        return starPicture;
    }

    public void setStarPicture(int starPicture) {
        this.starPicture = starPicture;
    }

    public int getStarColor() {
        return starColor;
    }

    public void setStarColor(int starColor) {
        this.starColor = starColor;
    }
    
   
}
