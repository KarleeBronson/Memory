/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory2;

import java.util.Scanner;

/**
 *
 * @author Karalee Foster
 */
public class MainMenuView extends Menu {
    
    static final String[][] menuItems = {
        {"S", "Start game"},
        {"H", "Help"},
        {"Q", "Exit Memory"}
    };
    
    public MainMenuView() {
        super(MainMenuView.menuItems);
    }
  
    /**
     *
     * @param object
     * @return
     */
@Override  
public String getInput(Object object) {
    
    String gameStatus = Game.PLAYING; // make a PLAYING like in the tictactoe game class
        do {
            this.display();

            // get commaned entered
            String command = this.getCommand();
            switch (command) {
                case "S":
                    //Player myPlayer = new Player();
                   // myPlayer.getName();
                    //myPlayer.getName2();
                    Board myBoard = new Board();
                    Board.displayCardArray();
                    CardMenuView myCardMenu = new CardMenuView();
                    myCardMenu.getInput();
                    //cardMenuView.display();
                    break;
                case "H":
                    MainMenuControl.displayBoardHelp();
                    MainMenuControl.displayComputerPlayerHelp();
                    MainMenuControl.displayCollectCardHelp();
                    MainMenuControl.displayGameHelp();
                    MainMenuControl.displayFlippedDownCardHelp();
                    MainMenuControl.displayFlippedUpCardHelp();
                    MainMenuControl.displayRealPlayerHelp();
                    MainMenuControl.displayShuffleCardsHelp();
                    break;
                case "Q":
                    return Game.QUIT; //Make an EXIT like in the tic tac toe Game class
            }
        } while (!gameStatus.equals("QUIT"));

        return "QUIT";
    }
}
    
