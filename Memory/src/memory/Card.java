package memory;

import java.io.Serializable;
/**
 *
 * @author Karalee Olsen
 */
public class Card implements Serializable{
     //starPicture = ;         //a variable for the word, number, or picture on the card
    String starColor = "yellow";
   /* String starColor1 = "yellow";
    String starColor2 = "blue";
    String starColor3 = "blue";
    String starColor4 = "green";
    String starColor5 = "green";
    String starColor6 = "red";
    String starColor7 = "red";
    String starColor8 = "orange";
    String starColor9 = "orange";
    */
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
