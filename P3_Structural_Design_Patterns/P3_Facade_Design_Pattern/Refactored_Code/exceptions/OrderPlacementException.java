package P3_Structural_Design_Patterns.P3_Facade_Design_Pattern.Refactored_Code.exceptions;

public class OrderPlacementException extends Exception {
    public OrderPlacementException(String orderId) {
        super("Error encountered while placing order: " + orderId);
    }
}
