package infinitedog.frisky.exceptions;

/**
 * Events generic exception.
 * @author InfiniteDog
 */
public class EventException extends Exception {

    public EventException() {
    }

    public EventException(String message) {
        super(message);
    }

    public EventException(Throwable cause) {
        super(cause);
    }

    public EventException(String message, Throwable cause) {
        super(message, cause);
    }      
    
}
