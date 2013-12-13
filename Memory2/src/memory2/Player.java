/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory2;

import byui.cit260.Memory2.exception.PlayerException;
import byui.cit260.Memory2.menus.CardMenuControl;
import java.io.Serializable;
import java.util.Scanner;

/**
 * Score Value/Keeping score, store score, store players name
 *
 * @author kbronson
 */
public class Player implements Serializable {

    private static String[] x1;
    public static int points = 0;
    public String name = "";
    public String name2 = "";
    public String whoseTurn = "";     //a variable containing a reference to the Player who's turn is next
    Player playerA;
    Player playerB;

    public Player() {
        //this.playerB = new Player();
        // this.playerA = new Player();
    }

    public int getPoints() {

        return points;
    }

    public  void addPoint() {
        setPoints(getPoints() + 1);
    }

    public void displayPoints() {
        System.out.println(this.name + "'s Points:" + points);
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getName() {
        Scanner inFile = Memory2.getInputFile();
        System.out.println("Enter your name Player A:");
        this.name = inFile.nextLine();
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void displayName() {
        System.out.println("Your name will be displayed here" + playerA.name + playerB.name);
    }

    /*public static void displayName(String x[][]) throws PlayerException {
     for (int PlayerA = name; x.length >= playerA; playerA++) {
     try {
     for (int playerA = 0; x[playerA].length >= playerB; playerB++) {
     System.out.print(x1[playerB] + "/t");
     }
     }catch(Exception e){
     throw new PlayerException ("")
     }
     System.out.println();
     }   */
    private void getWinnerLoser() {

        playerA.getName();
        playerB.getName();


        if (playerA.points < playerB.points) {
            System.out.println(playerB.name + "wins");
            System.out.println(playerA.name + "loses");
        } else if (playerA.points > playerB.points) {
            System.out.println(playerA.name + "wins");
            System.out.println(playerB.name + "loses");
        } else if (playerA == playerB) {
            System.out.println("players are tied");
        }

    }
/*private void getWinnerLoser() {

        playerA.getName();
        //playerB.getName();


        if (playerA.points < playerB.points) {
            System.out.println(playerB.name + "wins");
            System.out.println(playerA.name + "loses");
        } else if (playerA.points > playerB.points) {
            System.out.println(playerA.name + "wins");
            System.out.println(playerB.name + "loses");
        } else if (playerA == playerB) {
            System.out.println("players are tied");
        }

    }*/

    public Player getPlayerA() {
        return playerA;
    }

    public void setPlayerA(Player playerA) {
        this.playerA = playerA;
    }

    public Player getPlayerB() {
        return playerB;
    }

    public void setPlayerB(Player playerB) {
        this.playerB = playerB;
    }

    public String getWhoseTurn() {
        return whoseTurn;
    }

    public void setWhoseTurn(String whoseTurn) {
        this.whoseTurn = whoseTurn;
    }
}