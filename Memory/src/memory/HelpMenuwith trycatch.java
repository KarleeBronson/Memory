/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

import java.io.IOException;
import java.util.logging.Level; 
import java.util.logging.Logger;

/**
 *
 * @author kbronson
 */
public class HelpMenu throws IOException {
  

    throws java.io.IOException {
    char choice = 0, ignore = 0; 
         for(;;) {
            do{  
                System.out.println("Help on:");
                System.out.println(" H.   helpMenu ");
                System.out.println(" F.   FAQs ");
                System.out.println("Choose one (E to Exit): ");
                try { 
                 choice = (char) System.in.read();
                } catch (IOException ex) {
                    Logger.getLogger(HelpMenu.class.getName()).log(Level.SEVERE, null, ex);
                  }
  
   
                do {
                    try {
                         ignore = (char) System.in.read();
                    } catch (IOException ex) {
                         Logger.getLogger(HelpMenu.class.getName()).log(Level.SEVERE, null, ex);
                      }
                } while(ignore != '\n');
            } while ( choice < 'H' | choice > 'F' & choice != 'E');
   
            if(choice == 'E') break;
   
                System.out.println("\n");
   
                switch(choice){
                    case 'H': 
                        System.out.println("helpMenu:\n");
                        System.out.println("");
                        System.out.println("");
                        break;
                    case 'F':
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
    public void displayMyHelpMenu(){
        System.out.println("FAQs:\n");
    }
}

//I added the try catch to see what would happen. The logger and Level imports
//came up, and the try and catch sections went around the ifor that we had for 
//the system.in.read()