package eggervezoli.dominio;

public class InvalidDateRangeException extends Exception {

    public InvalidDateRangeException() {
        super();
    }

    public InvalidDateRangeException(String message) {
        super(message);
    }

    public InvalidDateRangeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidDateRangeException(Throwable cause) {
        super(cause);
    }
}
