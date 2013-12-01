/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Memory2.enums;

/**
 *
 * @author Karalee Foster
 */
public enum TestText {

    HELLO("Hello this is a test."),
    TESTING("1, 2, 3, Testing"),
    GOODBYE("Goodbye, the test is over.");
    
    String testText;

    private TestText(String testText) {
        this.testText = testText;
    }

    public String getTestText() {
        return testText;
    }
}
