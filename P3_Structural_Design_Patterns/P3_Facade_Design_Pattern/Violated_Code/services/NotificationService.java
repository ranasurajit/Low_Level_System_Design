package P3_Structural_Design_Patterns.P3_Facade_Design_Pattern.Violated_Code.services;

public class NotificationService {
    public void sendOrderConfirmation(String orderId) {
        System.out.println("Order confirmation sent for order " + orderId);
    }
}
