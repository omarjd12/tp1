public class TooLargeValueException extends Exception {
    public TooLargeValueException() {
        super("Valeur trop grande pour un entier 32 bits.");
    }
}
