package P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_3_Order_Status_Notification_System.Violated_Code.services;

import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_3_Order_Status_Notification_System.Violated_Code.models.Order;
import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_3_Order_Status_Notification_System.Violated_Code.models.OrderStatus;

public class OrderService {
    public void updateOrderStatus(Order order, OrderStatus newStatus) {

        order.setStatus(newStatus);

        if (newStatus == OrderStatus.PAID) {
            sendEmail(order);
            notifyWarehouse(order);
        }

        if (newStatus == OrderStatus.SHIPPED) {
            notifyDeliveryPartner(order);
        }

        if (newStatus == OrderStatus.DELIVERED) {
            sendDeliveryConfirmation(order);
            updateAnalytics(order);
        }
    }

    private void sendEmail(Order order) {
        System.out.println("Email sent to customer for order " + order.getOrderId());
    }

    private void notifyWarehouse(Order order) {
        System.out.println("Warehouse notified for order " + order.getOrderId());
    }

    private void notifyDeliveryPartner(Order order) {
        System.out.println("Delivery partner notified for order " + order.getOrderId());
    }

    private void sendDeliveryConfirmation(Order order) {
        System.out.println("Delivery confirmation sent for order " + order.getOrderId());
    }

    private void updateAnalytics(Order order) {
        System.out.println("Analytics updated for order " + order.getOrderId());
    }
}
