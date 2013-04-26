/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.exception;

/**
 *
 * @autor 1110186 & 1110590
 */
public class InvalidValue extends Exception {

    /**
     * Creates a new instance of
     * <code>InvalidValue</code> without detail message.
     */
    public InvalidValue() {
    }

    /**
     * Constructs an instance of
     * <code>InvalidValue</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidValue(String msg) {
        super(msg);
    }
}
