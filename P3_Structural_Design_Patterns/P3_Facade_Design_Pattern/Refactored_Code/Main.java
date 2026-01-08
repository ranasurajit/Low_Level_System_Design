package P3_Structural_Design_Patterns.P3_Facade_Design_Pattern.Refactored_Code;

import P3_Structural_Design_Patterns.P3_Facade_Design_Pattern.Refactored_Code.exceptions.OrderPlacementException;
import P3_Structural_Design_Patterns.P3_Facade_Design_Pattern.Refactored_Code.facades.OrderFacade;

public class Main {
    public static void main(String[] args) throws OrderPlacementException {
        OrderFacade facade = new OrderFacade();

        String productId = "P123";
        String orderId = "ORD-101";
        double amount = 2500;

        facade.placeOrder(productId, orderId, amount);
    }
}
