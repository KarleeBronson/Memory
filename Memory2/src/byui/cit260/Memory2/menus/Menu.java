/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.Memory2.menus;

import java.util.Scanner;
import byui.cit260.Memory2.interfaces.DisplayInfo;
import byui.cit260.Memory2.interfaces.EnterInfo;
import byui.cit260.Memory2.enums.GameStatus;
import byui.cit260.Memory2.exception.MenuException;
import memory2.Memory2;
import memory2.Memory2Error;

/**
 *
 * @author kbronson and Karalee Olsen
 */
public abstract class  Menu implements DisplayInfo, EnterInfo {
    
private String[][] menuItems = null;

  public Menu() {
  }

  public Menu(String[][] menuItems) {
  this();
  this.menuItems = menuItems;
  }

  public String[][] getMenuItems() {
  return menuItems;
  }

  public void setMenuItems(String[][] menuItems) {
  this.menuItems = menuItems;
  }
  
   /* private static final String[][] menuItems = {
        {"S", "Start game"},
        {"H", "Help"},
        {"Q", "Exit Memory"}
    };
  */
   
    MainMenuControl mainMenuControl = new MainMenuControl();
    CardMenuControl cardMenuControl = new CardMenuControl();
    
     public abstract GameStatus getInput(Object object); 
       

    /**
     *
     * @return
     */
    protected final String getCommand() throws MenuException {

        Scanner inFile = Memory2.getInputFile();
        String command;
        boolean valid = false;
        do {
            try{
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            valid = validCommand(command);
            if (!validCommand(command)) {
                new Memory2Error().displayError("Invalid command. Please enter a valid command."); //create a MemoryError Class like in the tictactoe example
                continue;
            }
            }
            catch(Exception e){
                throw new MenuException("Invalid command. Please enter a valid command.");
            }
        } while (!valid);

        return command;
    }

    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < this.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

    private boolean validCommand(String command) {
        String[][] items = this.menuItems;

        for (String[] item : this.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
    
}
