package myexception;

public class NameFormatterException extends RuntimeException{
    public NameFormatterException() {
        super();
    }

    public NameFormatterException(String message) {
        super(message);
    }
}
