/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Memory2.menus;

import byui.cit260.Memory2.enums.TestText;

/**
 *
 * @author Karalee Foster
 */
public class TestMenuControl {
    public String getTestText(TestText command){
        String testText ="";
        switch (command){
            case HELLO:
            case GOODBYE:
            case TESTING:
                testText = command.getTestText();
                break;
            default:
                System.out.println("Testing Enum");
        }
        return testText;
    }
}
