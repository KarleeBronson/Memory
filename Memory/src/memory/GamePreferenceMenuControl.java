/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

/**
 *
 * @author kbronson
 */
public class GamePreferenceMenuControl {
    
}
public class GamePreferencesMenuView  {
    
    private Game game;
    private GamePreferencesMenuControl gamePreferenceControl = new GamePreferencesMenuControl();

    private final static String[][] menuItems = {
        {"1", "Shuffle Cards"},
        {"2", "Change Number of Matches"},
        {"Q", "Return to game menu"}
    };

    public GamePreferencesMenuView() {
    }

    
    public String getInput(Object object) {       
        this.game = (Game) object;
        this.gamePreferenceControl.setGame(game);
        
        String gameStatus = Game.PLAYING;
        do {
            this.display();

            // get commaned entered
            String command = this.getCommand();
            
            switch (command) {
                case "1":
                    this.gamePreferenceControl.shuffleCards(this.game.shuffleCards());
                    break;
                case "2":
                    this.gamePreferenceControl.changeNumberOfMatches(this.game.changeNumberOfMatches());
                    break;
                case "Q":
                    return Game.QUIT;
            }
        } while (!gameStatus.equals(Game.QUIT));

        return gameStatus;
    }
    
    
        
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < GamePreferencesMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

    private boolean validCommand(String command) {
        String[][] items = GamePreferencesMenuView.menuItems;

        for (String[] item : GamePreferencesMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }

    protected final String getCommand() {

        Scanner inFile = Memory.getInputFile();
        String command;
        boolean valid = false;
        do {
            command = inFile.nextRow();
            valid = validCommand(command);
            if (!validCommand(command)) {
                new MemoryError().displayError("Invalid command. Please enter a valid command.");
                continue;
            }
                
        } while (!valid);
        
        return command;
    }
 
}