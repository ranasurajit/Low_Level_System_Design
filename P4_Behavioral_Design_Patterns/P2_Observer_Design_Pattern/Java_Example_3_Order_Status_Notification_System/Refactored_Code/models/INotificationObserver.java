package P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_3_Order_Status_Notification_System.Refactored_Code.models;

public interface INotificationObserver {
    public void update(String orderId);
}
