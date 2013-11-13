/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory2;

import java.io.Serializable;
import java.util.Scanner;

/**
 *Score Value/Keeping score, store score, store players name
 * @author kbronson
 */
public class Player implements Serializable{
    int points = 0;
    String name = "";
    String name2 = "";
    Player playerA;
    Player playerB;

    public Player() {
        this.playerB = new Player();
        this.playerA = new Player();
    }

    public int getPoints() {
        return points;

    }

    public void displayPoints() {
        System.out.println("Display Points:" + points);

    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getName() {
        Scanner inFile = Memory2.getInputFile();
        System.out.println("Enter your name:");
        this.name = inFile.nextLine();
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println("Your name will be displayed here" + playerA.name + playerB.name);
    }

    public void getWinnerLoser() {

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

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

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
    
}