/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory2;

import java.util.Scanner;

/**
 *
 * @author kbronson
 */
public class Player {
    int points = 0; 
 String name = "";
 Player playerA = new Player();
 Player playerB = new Player();

    public int getPoints() {
        return points;

    }
    public void displayPoints() {
         System.out.println ("Display Points:" + points);
    
}
    public void setPoints(int points) {
        this.points = points;
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
    
    public void displayName() {
        System.out.println ("Your name will be displayed here" + playerA.name + playerB.name);
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
}