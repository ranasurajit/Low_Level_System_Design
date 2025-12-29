package P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_3_Order_Status_Notification_System.Refactored_Code.services;

import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_3_Order_Status_Notification_System.Refactored_Code.models.IOrder;
import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_3_Order_Status_Notification_System.Refactored_Code.models.OrderStatus;

public class OrderService {
    public void updateOrderStatus(IOrder order, OrderStatus newStatus) {
        order.setStatus(newStatus);
    }
}
