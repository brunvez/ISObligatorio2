/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggervezoli.dominio;

/**
 *
 * @author Bruno
 */
public class NotEnoughParticipantsException extends Exception {
    
    public NotEnoughParticipantsException() {
        super();
    }

    public NotEnoughParticipantsException(String message) {
        super(message);
    }

    public NotEnoughParticipantsException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughParticipantsException(Throwable cause) {
        super(cause);
    }
}
