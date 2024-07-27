package student;

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}