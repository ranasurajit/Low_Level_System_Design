package P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_3_Order_Status_Notification_System.Violated_Code;

import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_3_Order_Status_Notification_System.Violated_Code.models.Order;
import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_3_Order_Status_Notification_System.Violated_Code.models.OrderStatus;
import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_3_Order_Status_Notification_System.Violated_Code.services.OrderService;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("ORD-101");

        OrderService service = new OrderService();
        service.updateOrderStatus(order, OrderStatus.PAID);
        service.updateOrderStatus(order, OrderStatus.SHIPPED);
        service.updateOrderStatus(order, OrderStatus.DELIVERED);
    }
}
