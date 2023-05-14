package Assignment.day11.practice01.Exception;

public class DuplicateKeyException extends RuntimeException {

    public DuplicateKeyException() {
        super("Duplicate key exists");
    }

    public DuplicateKeyException(String cause) {
        super(cause);
    }

    public DuplicateKeyException(Throwable cause) {
        super(cause);
    }
}
