package P3_Structural_Design_Patterns.P3_Facade_Design_Pattern.Violated_Code.services;

public class ShippingService {
    public void shipProduct(String productId) {
        System.out.println("Shipping product " + productId);
    }
}
