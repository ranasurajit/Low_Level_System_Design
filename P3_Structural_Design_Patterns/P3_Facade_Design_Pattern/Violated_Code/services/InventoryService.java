package P3_Structural_Design_Patterns.P3_Facade_Design_Pattern.Violated_Code.services;

public class InventoryService {
    public boolean checkStock(String productId) {
        System.out.println("Checking stock for product " + productId);
        return true;
    }
}
