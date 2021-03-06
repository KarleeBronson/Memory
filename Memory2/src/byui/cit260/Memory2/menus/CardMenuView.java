/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Memory2.menus;

import java.util.Scanner;
import byui.cit260.Memory2.enums.GameStatus;
import byui.cit260.Memory2.exception.MenuException;
import memory2.Memory2;
import memory2.Memory2Error;

/**
 * Card Menu
 * Checks if cards are equal to each other
 * @author kbronson
 */
    
public class CardMenuView {
    //an idea is to make a switch statement that has a case for each  number 
//that is select. So case 1 : replace the 1 with a B. case 5 : replace 5 with a B. 
//then create another switch statement or for(match=0; match<=5; match++)
//if else statement that says "if (1 && 5) , and do this for each match."

private final static String[][] menuItems = {
        {"1", "Card 1"},
        {"2", "Card 2"},
        {"3", "Card 3"},
        {"4", "Card 4"},
        {"5", "Card 5"},
        {"6", "Card 6"},
       /* {"7", "Card 7"},
        {"8", "Card 8"},
        {"9", "Card 9"},
        {"10", "Card 10"}, */
        {"Q", "Quit Game"}
    };
    // Create instance of the CardMenuControl (action) class
    private CardMenuControl cardMenuControl = new CardMenuControl();

    // default constructor
    public CardMenuView() {
    }

    // display the card menu and get the end users input selection
    public GameStatus getInput() throws MenuException {

        String gameStatus = "PLAYING"; 
        do {
            this.display();

            // get card entered
            String card = this.getCard();
            switch (card) {
                case "1":
                    CardMenuControl.displayCard1();
                    break;
                case "2":
                    CardMenuControl.displayCard2();
                    break;
                case "3":
                    CardMenuControl.displayCard2();
                    break;
                case "4":
                    CardMenuControl.displayCard4();
                    break;
                case "5":
                    CardMenuControl.displayCard1();
                    break;
                case "6":
                    CardMenuControl.displayCard4();
                    break;          
                case "Q":
                    return GameStatus.QUIT;
            }
        } while (!gameStatus.equals("QUIT"));

        return GameStatus.QUIT;
    }

    // displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the numbers of the cards you want to pick:\n\t\tFor Example, 2 6\n");

        for (int i = 0; i < CardMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

    // retrieves the command entered by the end user
    protected final String getCard() throws MenuException {

        Scanner inFile = Memory2.getInputFile(); // create like in the tictactoe example on the main class
        String card;
        boolean valid = false;
        do {
            try{
            card = inFile.nextLine();
            card = card.trim().toUpperCase();
            valid = validCard(card);
            if (!validCard(card)) {
                new Memory2Error().displayError("Invalid card. Please enter a valid card."); 
                continue;
            }
            }
            catch(NumberFormatException e){
                throw new MenuException("Invalid card #. Please enter a valid card #.");
            }
        } while (!valid);

        return card;
    }

    // determines if the command is valid
    private boolean validCard(String card) {
        String[][] items = CardMenuView.menuItems;

        for (String[] item : CardMenuView.menuItems) {
            if (item[0].equals(card)) {
                return true;
            }
        }
        return false;
    }
}

