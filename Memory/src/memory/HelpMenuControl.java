/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

/**
 *
 * @author Karalee Foster
 */
public class HelpMenuControl {

    public HelpMenuControl() {
    }

    public void displayBoardHelp() {
        System.out.println();
        this.displayHelpBorder();
        System.out.println(
                "\tThe game board for Memory. It consist of 2 rows with "
                + "\n\t5 cards in each row. Players click on the different cards  "
                + "\n\ton the board (2 at a time) in an effort to win the game. "
                + "\n\tThe default board is 2 rows by 5 columns.");
        displayHelpBorder();
    }

    public void displayGameHelp() {
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

    public void displayRealPlayerHelp() {
        System.out.println();
        displayHelpBorder();
        System.out.println(
                "\tA real player manually takes their turn by clicking on two cards "
                + "\n\tthat are not already a match.");
        displayHelpBorder();
    }

    public void displayComputerPlayerHelp() {
        System.out.println();
        displayHelpBorder();
        System.out.println(
                "\tA computer based player automatically takes its turn "
                + "\n\timmediatly after a real player in a single player game.");
        displayHelpBorder();
    }

    public void displayFlippedDownCardHelp() {
        System.out.println();
        displayHelpBorder();
        System.out.println(
                "\tA card on the board that a player can flip to reavel its contents.");
        displayHelpBorder();
    }

    public void displayFlippedUpCardHelp() {
        System.out.println();
        displayHelpBorder();
        System.out.println(
                "\tA flipped up card \"marks\" the cards on the board that have already "
                + "\n\tbeen matched by a player. "
                + "\n\tThe flipped up cards cannot be picked again for the duration of the round.");
        displayHelpBorder();
    }

    public void displayHelpBorder() {
        System.out.println(
                "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
