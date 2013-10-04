package memory;

import java.io.Serializable;
/**
 *
 * @author Karalee Olsen
 */
public class Card implements Serializable{
     //starPicture = ;         //a variable for the word, number, or picture on the card
    String starColor = "yellow";
    
    public void Card(){
    }

    /*public int getStarPicture() {
        return starPicture;
    }

    public void setStarPicture(int starPicture) {
        this.starPicture = starPicture;
    }
*/
    public String getStarColor() {
        return starColor;
    }

    public void setStarColor(String starColor) {
        this.starColor = starColor;
    }
    
   public void displayCard(){
       System.out.println("Card color: " + this.starColor);
   }
}
