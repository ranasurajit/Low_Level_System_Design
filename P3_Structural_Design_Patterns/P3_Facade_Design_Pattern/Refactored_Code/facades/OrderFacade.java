package P3_Structural_Design_Patterns.P3_Facade_Design_Pattern.Refactored_Code.facades;

import P3_Structural_Design_Patterns.P3_Facade_Design_Pattern.Refactored_Code.exceptions.OrderPlacementException;
import P3_Structural_Design_Patterns.P3_Facade_Design_Pattern.Refactored_Code.services.InventoryService;
import P3_Structural_Design_Patterns.P3_Facade_Design_Pattern.Refactored_Code.services.NotificationService;
import P3_Structural_Design_Patterns.P3_Facade_Design_Pattern.Refactored_Code.services.PaymentService;
import P3_Structural_Design_Patterns.P3_Facade_Design_Pattern.Refactored_Code.services.ShippingService;

public class OrderFacade {
    private InventoryService inventoryService;
    private NotificationService notificationService;
    private PaymentService paymentService;
    private ShippingService shippingService;

    public OrderFacade() {
        this.inventoryService = new InventoryService();
        this.notificationService = new NotificationService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
    }

    public void placeOrder(String productId, String orderId, double amount) throws OrderPlacementException {
        if (!inventoryService.checkStock(productId)) {
            throw new OrderPlacementException(orderId);
        }
        if (!paymentService.makePayment(amount)) {
            throw new OrderPlacementException(orderId);
        }
        shippingService.shipProduct(productId);
        notificationService.sendOrderConfirmation(orderId);
    }
}
