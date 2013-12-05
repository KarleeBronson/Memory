/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Memory2.menus;

import byui.cit260.Memory2.menus.Menu;
import java.util.Scanner;
import memory2.Board;
import byui.cit260.Memory2.interfaces.EnterInfo;
import byui.cit260.Memory2.enums.GameStatus;
import byui.cit260.Memory2.exception.MenuException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karalee Foster
 */
public class MainMenuView extends Menu implements EnterInfo{
    
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
public GameStatus getInput(Object object) {
    
    String gameStatus = "PLAYING"; // make a PLAYING like in the tictactoe game class
        do {
        try {
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
                    return GameStatus.QUIT; //Make an EXIT like in the tic tac toe Game class
            }
        } catch (MenuException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        } while (!gameStatus.equals("QUIT"));

        return GameStatus.QUIT;
    }
//not otherwise compatable
    @Override
    public Object display(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object displayError(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
    
