/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Memory2.menus;

/**
 *
 * @author Karalee Foster
 */
public class MainMenuControl  {

    public MainMenuControl() {
    }
     public static void displayBoardHelp() {
        System.out.println();
        displayHelpBorder();
        System.out.println(
                "\tThe game board for Memory. It consist of 2 rows with "
                + "\n\t5 cards in each row. Players click on the different cards  "
                + "\n\ton the board (2 at a time) in an effort to win the game. "
                + "\n\tThe default board is 2 rows by 5 columns.");
        displayHelpBorder();
    }

    public static void displayGameHelp() {
        System.out.println();
        displayHelpBorder();
        System.out.println(
                "\tThe objective of the game is to be the player with the most "
                + "\n\tcard matches for atleast 2 out of 3 rounds. Each player "
                + "\n\ttakes turns clicking on two cards on the board. If they get "
                + "\n\ta match, they take another turn. Otherwise, their turn ends"
                + "\n\tand the next player begins their turn. The player who finds "
                + "\n\tthe most matches wins the round. The player who wins 2 out "
                + "\n\tof 3 rounds wins the game. ");
        displayHelpBorder();
    }

    public static void displayRealPlayerHelp() {
        System.out.println();
        displayHelpBorder();
        System.out.println(
                "\tA real player manually takes their turn by clicking on two cards "
                + "\n\tthat are not already a match.");
        displayHelpBorder();
    }

    public static void displayComputerPlayerHelp() {
        System.out.println();
        displayHelpBorder();
        System.out.println(
                "\tA computer based player automatically takes its turn "
                + "\n\timmediatly after a real player in a single player game.");
        displayHelpBorder();
    }

    public static void displayFlippedDownCardHelp() {
        System.out.println();
        displayHelpBorder();
        System.out.println(
                "\tA card on the board that a player can flip to reavel its contents.");
        displayHelpBorder();
    }

    public static void displayFlippedUpCardHelp() {
        System.out.println();
        displayHelpBorder();
        System.out.println(
                "\tA flipped up card \"marks\" the cards on the board that have already "
                + "\n\tbeen matched by a player. "
                + "\n\tThe flipped up cards cannot be picked again for the duration of the round.");
        displayHelpBorder();
    }

    public static void displayCollectCardHelp() {
         System.out.println();
        displayHelpBorder();
        System.out.println(
                "\tThis option will collect each match you make and put it into your pile. ");
        displayHelpBorder();
    }
    
    public static void displayShuffleCardsHelp() {
         System.out.println();
         displayHelpBorder();
         System.out.println(
                 "\tThis option will shuffle the cards on the board.");
         displayHelpBorder();
    }
    public static void displayHelpBorder() {
        System.out.println(
                "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
