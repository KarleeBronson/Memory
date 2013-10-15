/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

import java.io.IOException;

/**
 *
 * @author kbronson
 */
public class HelpMenu {

    /**
     *
     * @throws IOException
     * 
     * I put our stuff in the function and changed the letters H and F to 1 and 2.
     */
    public void displayHelpMenu() throws IOException {

        char choice, ignore;
        for (;;) {
            do {
                System.out.println("Help on:");
                System.out.println(" 1.   helpMenu ");
                System.out.println(" 2.   FAQs ");
                System.out.println("Choose one (E to Exit): ");
                choice = (char) System.in.read();


                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (choice < '1' | choice > '2' & choice != 'E');

            if (choice == 'E') {
                break;
            }

            System.out.println("\n");

            switch (choice) {
                case '1':
                    System.out.println("helpMenu:\n");
                    System.out.println("");
                    System.out.println("");
                    break;
                case '2':
                    System.out.println("FAQs:\n");
                    System.out.println(" Can more than 2 players be added to the game?"
                            + "There can only be 2 players ");
                    System.out.println(" How long does each round last?"
                            + "Each game lasts as long as it takes for one player to make 3 matches");
                    System.out.println(" Can you add cards to create more matches?"
                            + "No, you are not able to add more cards.");
                    System.out.println(" How do I end my game?"
                            + "You can end your game by hitting 'Q' to quit the game.");
                    System.out.println(" Can I save my game and continue later?"
                            + "No, once you exit the game, your game will not be saved.");
                    System.out.println(" How do I win?"
                            + "To win the game you must make the most matches and win 2 out of the 3 rounds.");
                    System.out.println(" Can I use my keyboard as a mouse?"
                            + "You can only use your mouse in this game.");
                    break;

            }
            System.out.println();
        }
    }
//public void displayMyHelpMenu(){
    //System.out.println("FAQs:\n");
}
