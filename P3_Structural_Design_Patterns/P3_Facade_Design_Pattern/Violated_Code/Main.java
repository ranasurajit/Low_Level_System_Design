package P3_Structural_Design_Patterns.P3_Facade_Design_Pattern.Violated_Code;

import P3_Structural_Design_Patterns.P3_Facade_Design_Pattern.Violated_Code.services.InventoryService;
import P3_Structural_Design_Patterns.P3_Facade_Design_Pattern.Violated_Code.services.NotificationService;
import P3_Structural_Design_Patterns.P3_Facade_Design_Pattern.Violated_Code.services.PaymentService;
import P3_Structural_Design_Patterns.P3_Facade_Design_Pattern.Violated_Code.services.ShippingService;

public class Main {
    public static void main(String[] args) {
        String productId = "P123";
        String orderId = "ORD-101";
        double amount = 2500;

        InventoryService inventory = new InventoryService();
        PaymentService payment = new PaymentService();
        ShippingService shipping = new ShippingService();
        NotificationService notification = new NotificationService();

        if (inventory.checkStock(productId)) {
            if (payment.makePayment(amount)) {
                shipping.shipProduct(productId);
                notification.sendOrderConfirmation(orderId);
            }
        }
    }
}
