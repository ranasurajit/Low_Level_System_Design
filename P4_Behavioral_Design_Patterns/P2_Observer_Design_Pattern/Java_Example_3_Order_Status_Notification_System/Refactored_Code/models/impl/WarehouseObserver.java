package P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_3_Order_Status_Notification_System.Refactored_Code.models.impl;

import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_3_Order_Status_Notification_System.Refactored_Code.models.INotificationObserver;

public class WarehouseObserver implements INotificationObserver {
    @Override
    public void update(String orderId) {
        System.out.println("Warehouse notified for order " + orderId);
    }
}
