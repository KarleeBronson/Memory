package memory;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author karlee bronson + Karalee Olsen
 */
public class Player implements Serializable {
    /*I do not think we need the fistName and lastName variables if we use String name.
     * int lastName,               players last name*/
    /*firstName;                  players firstname */

    public static final String REGULAR_PLAYER = "REGULAR";
    public static final String COMPUTER_PLAYER = "COMPUTER";
    String name;             //a String variable for the players name
    int points;              //an int variable for the number of points that player has
    int[] pairsWon;         // an array of type Pair that holds the list of cards won by this player
    int numberOfPairsWon;    // an int variable for the number of pairs won by this player
    String playerType;
    long wins = 0;
    long losses = 0;
    long ties = 0;
    int flippedCard;
    Player playerA = new Player();
    Player playerB = new Player();

    /**
     *
     * @param args
     */
    /* public static void main(String[] args) {
     
     playerA.getName();
     playerA.getPairsWon();
     playerA.getPoints();
     playerA.getNumberOfPairsWon();
     
     playerB.getName();
     playerB.getPairsWon();
     playerB.getPoints();
     playerB.getNumberOfPairsWon();
     }    */
    public void Player() {
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

    public String getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        this.name = input.next();
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getPairsWon() {

        return pairsWon;
    }

    public void setPairsWon(int[] pairsWon) {
        this.pairsWon = pairsWon;
    }

    public int getPoints(int pairsWon) {

        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getNumberOfPairsWon() {
        return numberOfPairsWon;
    }

    public void setNumberOfPairsWon(int numberOfPairsWon) {
        this.numberOfPairsWon = numberOfPairsWon;
    }
    // The following information inside this function might 
    // actually need to be somewhere else becasue the results 
    // are not telling us the number of pairs won, it is telling 
    // us who wins. 

    public int getRoundWinnerLoser() {
        for (playerA.numberOfPairsWon >= 0 && playerB.numberOfPairsWon >= 0 ) {
            if (playerA.numberOfPairsWon >= 3) {
                System.out.println(this.name + " wins this round!");
                System.out.println(this.name + " loses this round.");
            } else if (playerA.numberOfPairsWon <= 2) {
                System.out.println(this.name + " loses this round.");
                System.out.println(this.name + " wins this round!");
            } else {
                System.out.println("Players are tied this round.");
            }
        }
        return playerA.numberOfPairsWon;
        return playerB.numberOfPairsWon;
        return 0;

    }

    //This will tell the user how to the win the game. 
    public void displayHowToWin() {
        System.out.println("To becmome the winner of Memory you must win");
        System.out.println("Two rounds or more \t One round or less \t.\n Winner \t\t Loser");
        System.out.println("\t\n");
    }

    /**
     *
     * @return
     */
    public int[] displayNumberOfPairsWon() {
        int sumA = 0;
        int sumB = 0;

        // these will eventually have more in the array and will have the matches for each round put in.
        int roundMatchesA[] = {playerA.numberOfPairsWon};
        int roundMatchesB[] = {playerB.numberOfPairsWon};

        // the sum of the matches for each round - player A
        for (int x : roundMatchesA) {
            System.out.print("Player A Matches: " + x);
            sumA += x;
        }
        // the sum of the matches for each round - player B
        for (int y : roundMatchesB) {
            System.out.print("Player B Matches: " + y);
            sumB += y;
        }
        System.out.println("Player A's total matches: " + sumA + "\n Player B's total matches: " + sumB);
        return ;
        
        
    }

    public void getWinnerLoser() {

        Player playerA = new Player();
        playerA.getName();
        Player playerB = new Player();
        playerB.getName();

        if (playerA.points < playerB.points) {
            System.out.println(name + "wins");
        } else if (playerA.points > playerB.points) {
            System.out.println(name + "wins");
        } else if (playerA == playerB) {
            System.out.println("players are tied");
            return;
        }
        /*   int wins
         double totalScore = wins + losses + ties;
        
         if (totalScore == 0) {
         return 0;
         }
        
         double winLossAverage = wins / totalScore;
         return winLossAverage * 100;*/
    }

    /**
     *
     * @param wins
     * @param losses
     * @param ties
     * @return
     */
    public double getWinningPercentage(long wins, long losses, long ties) {

        if (this.wins < 0) {
            System.out.println("\n\tThe number of wins must be "
                    + "greater than or equal to zero.");
            return -999;
        }

        if (this.losses < 0) {
            System.out.println("\n\tThe number of losses must be "
                    + "greater than or equal to zero.");
            return -999;
        }

        if (this.ties < 0) {
            System.out.println("\n\tThe number of ties must be "
                    + "greater than or equal to zero.");
            return -999;
        }

        long totalScore = this.wins + this.losses + this.ties;
        double totalScore1 = totalScore;
        if (totalScore1 == 0) {
            return 0;
        }

        double winLossRatio = this.wins / totalScore1;
        return winLossRatio * 100;

    }

    public void displayWinningPercentage() {
        System.out.println("\ntotalScore1: " + this.wins + this.losses + this.ties);
        System.out.println("The 'totalScore1' will eventually change once we are more progressed "
                + "in our program.\n");
    }

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

    String getPlayerStastics() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}    
