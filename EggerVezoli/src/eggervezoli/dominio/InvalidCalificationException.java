
package eggervezoli.dominio;


public class InvalidCalificationException extends Exception {
    public InvalidCalificationException() {
        super();
    }

    public InvalidCalificationException(String message) {
        super(message);
    }

    public InvalidCalificationException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidCalificationException(Throwable cause) {
        super(cause);
    }
}
