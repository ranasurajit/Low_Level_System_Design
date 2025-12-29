package P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_3_Order_Status_Notification_System.Violated_Code.models;

public class Order {
    private String orderId;
    private OrderStatus status;

    public Order(String orderId) {
        this.orderId = orderId;
        this.status = OrderStatus.CREATED;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public String getOrderId() {
        return orderId;
    }
}
