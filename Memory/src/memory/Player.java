package memory;

import java.io.Serializable;
    import java.util.Scanner;
/**
 *
 * @author kbronson
 */
public class Player implements Serializable{
     /*I do not think we need the fistName and lastName variables if we use String name.
      * int lastName,               players last name*/
     /*firstName;                  players firstname */         
     String name;             //a String variable for the players name
     int points;              //an int variable for the number of points that player has
     int [] pairsWon;         //an array of type Pair that holds the list of cards won by this player
     int numberOfPairsWon;
     String playerType;
     long wins = 0;
     long losses = 0;
     long ties = 0; 
     int flippedCard;
     
    /**
     *
     * @param args
     */
   /* public static void main(String[] args) {
          Players playerA = new Players();
          playerA.getName();
          playerA.getPairsWon();
          playerA.getPoints();
          playerA.getNumberOfPairsWon();
          Players playerB = new Players();
          playerB.getName();
          playerB.getPairsWon();
          playerB.getPoints();
          playerB.getNumberOfPairsWon();
    }    */ 
      public void Players(){
      }    
     /* public void getName(){
          Scanner input = new Scanner (System.in);
          System.out.println ("Enter your name:");
          this.name = input.next ();
      }
      */
      public void displayName() {
        System.out.println("\t\tHello, my name is " + this.name);
      }
      
      // The following information inside this function might 
      // actually need to be somewhere else becasue the results 
      // are not telling us the number of pairs won, it is telling 
      // us who wins. 
      public void getNumberOfPairsWon (){
            if (numberOfPairsWon >= 3) {
                System.out.println (this.name + " wins!");
             } 
                else if (numberOfPairsWon <= 2){
                    System.out.println (this.name + " loses.");
                }
                else if (numberOfPairsWon == 3){ 
                    System.out.println ("Players are tied.");
                }
       }
        
      //This will tell the user how to the win the game. 
      
     

        public void displayNumberOfPairsWon (){
            System.out.println ("To becmome the winner of Memory you must win");
            System.out.println ("Two rounds or more \t One round or less \t.\n Winner \t\t Loser");
            System.out.println ("\t\n");
      }
                
      
     public void getWinnerLoser (String name){
          
          Player playerA = new Player();
          playerA.getName();
          Player playerB = new Player();
          playerB.getName();
          
          if (playerA. < playerB){ 
                System.out.println (name "wins");
                return ;
            }
                else if (playerA > playerB) {
                    System.out.println (name "wins");
                    return ;
                }
            
   
             
                /*else if (playerA = playerB) {
                    System.out.println ("players are tied");
                    return;
                }*/
            
            /*double totalScore = wins + losses + ties;
        
        if (totalScore == 0) {
            return 0;
        }
        
        double winLossAverage = wins / totalScore;
        return winLossAverage * 100;*/
    }

    public String getName() {
        Scanner input = new Scanner (System.in);
          System.out.println ("Enter your name:");
          this.name = input.next ();
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int[] getPairsWon() {
        return pairsWon;
    }

    public void setPairsWon(int[] pairsWon) {
        this.pairsWon = pairsWon;
    }

   /* public int getNumberOfPairsWon() {
         return numberOfPairsWon;
    }

    public void setNumberOfPairsWon(int numberOfPairsWon) {
        this.numberOfPairsWon = numberOfPairsWon;
    }*/

    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public long getWins() {
        return wins;
    }

    public void setWins(long wins) {
        this.wins = wins;
    }

    public long getLosses() {
        return losses;
    }

    public void setLosses(long losses) {
        this.losses = losses;
    }

    public long getTies() {
        return ties;
    }

    public void setTies(long ties) {
        this.ties = ties;
    }

    public int getFlippedCard() {
        return flippedCard;
    }

    public void setFlippedCard(int flippedCard) {
        this.flippedCard = flippedCard;
    }
      
   //  public void displayName(){
    //   System.out.println ("Enter your name:");
    //  }
     // I do not think we need this displayname() section because 
     // there is a setName() function above that does the same thing. 
     // I think we should delete this one, since the getter setter 
     // thing automatically put it on above. We should also choose if 
    // we want to even have this in this class, since the Memory class already asks for the names.
}    

/*dataType variableName= values
String lastName
String firstName
*/