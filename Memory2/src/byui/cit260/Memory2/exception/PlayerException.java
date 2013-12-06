/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Memory2.exception;

/**
 *
 * @author Karalee Foster
 */
public class PlayerException extends Exception{

    public PlayerException() {
    }

    public PlayerException(String message) {
        super(message);
    }

    public PlayerException(String message, Throwable cause) {
        super(message, cause);
    }

    public PlayerException(Throwable cause) {
        super(cause);
    }

    public PlayerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
