package P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_3_Order_Status_Notification_System.Refactored_Code;

import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_3_Order_Status_Notification_System.Refactored_Code.models.OrderStatus;
import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_3_Order_Status_Notification_System.Refactored_Code.models.impl.AnalyticsObserver;
import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_3_Order_Status_Notification_System.Refactored_Code.models.impl.DeliveryConfirmationObserver;
import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_3_Order_Status_Notification_System.Refactored_Code.models.impl.DeliveryPartnerObserver;
import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_3_Order_Status_Notification_System.Refactored_Code.models.impl.EmailObserver;
import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_3_Order_Status_Notification_System.Refactored_Code.models.impl.Order;
import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_3_Order_Status_Notification_System.Refactored_Code.models.impl.WarehouseObserver;
import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_3_Order_Status_Notification_System.Refactored_Code.services.OrderService;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("ORD-101");
        System.out.println("Subscribe all Observers\n");
        order.addObserver(new EmailObserver(), OrderStatus.PAID);
        order.addObserver(new WarehouseObserver(), OrderStatus.PAID);
        order.addObserver(new DeliveryPartnerObserver(), OrderStatus.SHIPPED);
        order.addObserver(new DeliveryConfirmationObserver(), OrderStatus.DELIVERED);
        order.addObserver(new AnalyticsObserver(), OrderStatus.FEEDBACK);

        OrderService service = new OrderService();
        // updating order status
        service.updateOrderStatus(order, OrderStatus.CREATED);
        service.updateOrderStatus(order, OrderStatus.PAID);
        service.updateOrderStatus(order, OrderStatus.SHIPPED);
        service.updateOrderStatus(order, OrderStatus.DELIVERED);
        service.updateOrderStatus(order, OrderStatus.FEEDBACK);
        System.out.println();
        System.out.println("Un-subscribe AnalyticsObserver");
        System.out.println();
        // un-subscribing AnalyticsObserver
        order.removeObserver(OrderStatus.FEEDBACK);
        // updating order status
        service.updateOrderStatus(order, OrderStatus.CREATED);
        service.updateOrderStatus(order, OrderStatus.PAID);
        service.updateOrderStatus(order, OrderStatus.SHIPPED);
        service.updateOrderStatus(order, OrderStatus.DELIVERED);
    }
}
