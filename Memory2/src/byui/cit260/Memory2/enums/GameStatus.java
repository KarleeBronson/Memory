/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Memory2.enums;

/**
 *
 * @author Karalee Foster & Karlee Bronson
 */
public enum GameStatus {
    //public static final String START_GAME = "START_GAME";
       PLAYING("PLAYING"),
       QUIT("QUIT");
       
    String value;
    
    GameStatus (String value){
        this.value = value;
    }
    
    public String getStatus(){
        return value;
    }
}
