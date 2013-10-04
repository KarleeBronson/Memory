/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memorygame;

import java.io.Serializable;

public class Card implements Serializable{
     String starColor = "yellow";
    
    public void Card(){
    }

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
