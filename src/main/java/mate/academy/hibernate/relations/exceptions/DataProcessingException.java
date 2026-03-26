package mate.academy.hibernate.relations.exceptions;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message) {
        super(message);
    }

    public DataProcessingException(Exception e) {
        super(e);
    }

    public DataProcessingException(String message, Exception e) {
        super(message, e);
    }
}
