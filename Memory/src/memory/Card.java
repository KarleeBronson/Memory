package memory;

import java.io.Serializable;
/**
 *
 * @author Karalee Olsen
 */
public class Card implements Serializable{
     //starPicture = ;         //a variable for the word, number, or picture on the card
    String starColor = "yellow";
    String greenCard, yellowCard, redCard, blueCard, orangeCard, greenCard2, yellowCard2, redCard2, blueCard2, orangeCard2;
    String cardMatch ,cardMatch1, cardMatch2 ,cardMatch3, cardMatch4 ;
    double roundScore;
    double roundScore2;
    
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

    public String getGreenCard() {
        return greenCard;
    }

    public void setGreenCard(String greenCard) {
        this.greenCard = greenCard;
    }

    public String getYellowCard() {
        return yellowCard;
    }

    public void setYellowCard(String yellowCard) {
        this.yellowCard = yellowCard;
    }

    public String getRedCard() {
        return redCard;
    }

    public void setRedCard(String redCard) {
        this.redCard = redCard;
    }

    public String getBlueCard() {
        return blueCard;
    }

    public void setBlueCard(String blueCard) {
        this.blueCard = blueCard;
    }

    public String getOrangeCard() {
        return orangeCard;
    }

    public void setOrangeCard(String orangeCard) {
        this.orangeCard = orangeCard;
    }

    public String getGreenCard2() {
        return greenCard2;
    }

    public void setGreenCard2(String greenCard2) {
        this.greenCard2 = greenCard2;
    }

    public String getYellowCard2() {
        return yellowCard2;
    }

    public void setYellowCard2(String yellowCard2) {
        this.yellowCard2 = yellowCard2;
    }

    public String getRedCard2() {
        return redCard2;
    }

    public void setRedCard2(String redCard2) {
        this.redCard2 = redCard2;
    }

    public String getBlueCard2() {
        return blueCard2;
    }

    public void setBlueCard2(String blueCard2) {
        this.blueCard2 = blueCard2;
    }

    public String getOrangeCard2() {
        return orangeCard2;
    }

    public void setOrangeCard2(String orangeCard2) {
        this.orangeCard2 = orangeCard2;
    }

    public String getCardMatch() {
        cardMatch = this.blueCard + this.blueCard2;
        return cardMatch;
    }

    public void setCardMatch(String cardMatch) {
        this.cardMatch = cardMatch;
    }

    public String getCardMatch1() {
        cardMatch1 = this.greenCard + this.greenCard2;
        return cardMatch1;
    }

    public void setCardMatch1(String cardMatch1) {
        this.cardMatch1 = cardMatch1;
    }

    public String getCardMatch2() {
        cardMatch2 = this.orangeCard + this.orangeCard2;
        return cardMatch2;
    }

    public void setCardMatch2(String cardMatch2) {
        this.cardMatch2 = cardMatch2;
    }

    public String getCardMatch3() {
        cardMatch3 = this.redCard + this.redCard2;
        return cardMatch3;
    }

    public void setCardMatch3(String cardMatch3) {
        this.cardMatch3 = cardMatch3;
    }

    public String getCardMatch4() {
       cardMatch4 = this.yellowCard + this.yellowCard2;
        return cardMatch4;
    }

    public void setCardMatch4(String cardMatch4) {
        this.cardMatch4 = cardMatch4;
    }
   
    public void displayPossibleMatches(){
        System.out.println("The possible matches are: " + this.cardMatch + "\t" + this.cardMatch1 + "\t" + this.cardMatch2 + "\t" + this.cardMatch3 + "\t" + this.cardMatch4);
    }
  
    public double getRoundScore() {
        int points = 0;
        roundScore = points;
        
        if (this.cardMatch ; || this.cardMatch1; || this.cardMatch2; || this.cardMatch3; || this.cardMatch4){
            do {
                System.out.println(" You have found a match.\n Take another turn.");
                roundScore++;
            }
                while(roundScore < 5.0);
        }
            else if{
                System.out.println("Not a match.\n Your turn is over.");
            }
    
        return roundScore;
    }

    public void setRoundScore(double roundScore) {
        this.roundScore = roundScore;
    }
 public double getRoundScore2() {
        int points = 0;
        roundScore2 = points;
       
        if (this.cardMatch ; || this.cardMatch1; || this.cardMatch2; || this.cardMatch3; || this.cardMatch4){
            do {
                System.out.println(" You have found a match.\n Take another turn.");
                roundScore2++;
            }
                while(roundScore2 < 5.0);
        }
            else if{
                System.out.println("Not a match.\n Your turn is over.");
            }
    
        return roundScore2;
    }

    public void setRoundScore2(double roundScore2) {
        this.roundScore2 = roundScore2;
    }

    public void displayRoundScores{
    System.out.println("Round score for Player A" + "\tRound score for Player B" + "\n" + this.roundScore + "\t" this.roundscore2);
    }
}
