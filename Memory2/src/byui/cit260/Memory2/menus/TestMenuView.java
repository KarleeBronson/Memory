/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Memory2.menus;

import memory2.EnterInfo;
import memory2.GameStatus;

/**
 *
 * @author Karalee Foster
 */
public class TestMenuView extends Menu implements EnterInfo {

    private final static String[][] menuItems = {
        {"H", "Hello"},
        {"T", "Testing"},
        {"G", "Goodbye"},
        {"Q", "Quit Test"}
    };

    public TestMenuView() {
        super(TestMenuView.menuItems);
    }

    @Override
    public GameStatus getInput(Object object) {

        GameStatus gameStatus = GameStatus.PLAYING;
        do {
            this.display();

            // get commaned entered
            String command = this.getCommand();
            switch (command) {
                case "H":
                    this.displayTest(Test.HELLO);
                    break;
                case "T":
                    this.displayTest(Test.TESTING);
                    break;
                case "G":
                    this.displayTest(Test.GOODBYE);
                    break;
                case "Q":
                    return GameStatus.QUIT;
            }
        } while (gameStatus != GameStatus.QUIT);

        return gameStatus;
    }

    private void displayTest(Test testText) {
        StringBuilder dividerLine = new StringBuilder(80);
        for (int i = 0; i < 80; i++) {
            dividerLine.insert(i, '~');
        }
        System.out.println("\t" + dividerLine.toString());
        System.out.println(testText.getTestText());
        System.out.println("\t" + dividerLine.toString());
    }

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

    // nested class to define the text for each help item in the menu
    private enum Test {

        HELLO("Hello this is a test."),
        TESTING("1, 2, 3, Testing"),
        GOODBYE("Goodbye, the test is over.");
        String testText;

        Test(String testText) {
            this.testText = testText;
        }

        public String getTestText() {
            return testText;
        }

        public void setHelpText(String testInfo) {
            this.testText = testInfo;
        }
    }
}
