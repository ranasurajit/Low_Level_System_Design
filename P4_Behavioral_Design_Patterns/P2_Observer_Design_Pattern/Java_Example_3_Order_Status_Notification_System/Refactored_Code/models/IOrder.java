package P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_3_Order_Status_Notification_System.Refactored_Code.models;

public interface IOrder {
    public void setStatus(OrderStatus status);

    public OrderStatus getStatus();

    public String getOrderId();

    public void addObserver(INotificationObserver observer, OrderStatus status);

    public void removeObserver(OrderStatus status);

    public void notifyObservers(OrderStatus status);
}
