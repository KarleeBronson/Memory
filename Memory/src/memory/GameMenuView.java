/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

import java.util.Scanner;

/**
 *
 * @author Karalee Foster
 */
public class GameMenuView {
    private Game game;
    private GameMenuControl gameMenuControl ; // create a GameMenuControl class like in the tic tac toe example


    private final static String[][] menuItems = {
        {"T", "Take your turn"},
        {"D", "Display the board"},
        {"N", "New Game"},
        {"R", "Report stastics"},
        {"H", "Help"},
        {"Q", "QUIT"}
    };

    public GameMenuView(Game game) {
        this.gameMenuControl = new GameMenuControl(game); 
                                                          
    }

    
    
    public Object getInput(Object object) {
        this.game = (Game) object;

        this.game.setStatus(Game.CONTINUE); // create a CONTINUE on the game class like in the tic tac toe example
        
        String gameStatus = this.game.getStatus();
        do {
     
            this.display();
            
            // get commaned entered
            String command = this.getCommand();
            switch (command) {
                case "T":
                    this.gameMenuControl.takeTurn();
                    break;
                case "D":
                    gameMenuControl.displayBoard();
                    break;
                case "N":
                    gameMenuControl.startNewGame();
                    break;
                case "R":
                    gameMenuControl.displayStatistics();
                    break;
                
                case "H":
                    gameMenuControl.displayHelpMenu();
                    break;
                case "Q":
                    gameStatus = "QUIT";
                    break;
            }
        } while (!gameStatus.equals("QUIT"));

        return Game.PLAYING; // create a PLAYING like on the tic tac to game class
    }
    


    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < GameMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

    private boolean validCommand(String command) {
        String[][] items = GameMenuView.menuItems; // create a GameMenuView like in the tic tac toe example

        for (String[] item : GameMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }

    protected final String getCommand() {

        Scanner inFile = Memory.getInputFile(); // create in the memory main class
        String command;
        boolean valid = false;
        do {
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            valid = validCommand(command);
            if (!validCommand(command)) {
                new MemoryError().displayError("Invalid command. Please enter a valid command."); // create a memory error class like in the tic tac to example
                continue;
            }
                
        } while (!valid);
        
        return command;
    }
}
