package voter;


class InvalidAgeForVoterException extends Exception {
    public InvalidAgeForVoterException(String message) {
        super(message);
    }
}