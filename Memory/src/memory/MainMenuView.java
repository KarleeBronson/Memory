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
public class MainMenuView {
     private static final String[][] menuItems = {
        {"1", "One player game"},
        {"2", "Two player game"},
        {"H", "Help"},
        {"X", "Exit Memory"}
    }; 
  
    MainMenuControl mainMenuControl = new MainMenuControl();
    
    public MainMenuView() {

    }
 
    
    public String getInput(Object object) {       
        
        String gameStatus = Game.PLAYING; // make a PLAYING like in the tictactoe game class
        do {
            this.display();

            // get commaned entered
            String command = this.getCommand();
            switch (command) {
                case "1":
                    this.mainMenuControl.startGame(1);
                    break;
                case "2":
                    this.mainMenuControl.startGame(2);
                    break;
                case "H":
                    HelpMenuView helpMenu = Memory.getHelpMenu();
                    helpMenu.getInput();
                    break;
                case "X":
                    return Game.EXIT; //Make an EXIT like in the tic tac toe Game class
            }
        } while (!gameStatus.equals("QUIT"));

        return "QUIT";
    }
    
    
   public final String getCommand() {

        Scanner inFile = Memory.getInputFile();
        String command;
        boolean valid = false;
        do {
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            valid = validCommand(command);
            if (!validCommand(command)) {
                new MemoryError().displayError("Invalid command. Please enter a valid command."); //create a MemoryError Class like in the tictactoe example
                continue;
            }
                
        } while (!valid);
        
        return command;
    }
    
    
   public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < MainMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

    private boolean validCommand(String command) {
        String[][] items = MainMenuView.menuItems;

        for (String[] item : MainMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
    
   
    
}


