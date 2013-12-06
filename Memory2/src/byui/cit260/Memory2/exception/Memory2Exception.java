/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Memory2.exception;

/**
 *
 * @author Karalee Foster
 */
public class Memory2Exception extends Exception {

    public Memory2Exception() {
    }

    public Memory2Exception(String message) {
        super(message);
    }

    public Memory2Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public Memory2Exception(Throwable cause) {
        super(cause);
    }

    public Memory2Exception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
