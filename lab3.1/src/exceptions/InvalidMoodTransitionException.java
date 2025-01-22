package exceptions;

public class InvalidMoodTransitionException extends Exception {
    public InvalidMoodTransitionException(String message) {
        super(message);
    }
}