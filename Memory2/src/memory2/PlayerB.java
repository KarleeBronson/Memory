/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory2;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Karalee Foster
 */
public class PlayerB implements Serializable {
    public static int points = 0;
    public String name = "";

    public PlayerB() {
    }

    public static int getPoints() {
        int i;
       
       for(i = 0; i<= 1; i++){
         points += i;
    }return points;
    }
    
    public static void setPoints(int points) {
        PlayerB.points = points;
    }
public void displayPoints() {
        System.out.println(this.name + "'s Points: " + points);
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
    
}
