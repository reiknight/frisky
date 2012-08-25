package infinitedog.frisky.exceptions;

/**
 * Input Events exception.
 * @author InfiniteDog
 */
public class InputEventException extends EventException {

    public InputEventException() {
    }

    public InputEventException(String message) {
        super(message);
    }

    public InputEventException(Throwable cause) {
        super(cause);
    }

    public InputEventException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
