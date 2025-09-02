package unit1;

public class insufficientbalance extends RuntimeException {
    public insufficientbalance(String message) {
        super(message);
    }
}
