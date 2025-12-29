package P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_3_Order_Status_Notification_System.Refactored_Code.models.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_3_Order_Status_Notification_System.Refactored_Code.models.INotificationObserver;
import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_3_Order_Status_Notification_System.Refactored_Code.models.IOrder;
import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_3_Order_Status_Notification_System.Refactored_Code.models.OrderStatus;

public class Order implements IOrder {
    private String orderId;
    private OrderStatus status;
    private Map<OrderStatus, ArrayList<INotificationObserver>> observersMap;

    public Order(String orderId) {
        this.orderId = orderId;
        this.status = OrderStatus.CREATED;
        this.observersMap = new HashMap<OrderStatus, ArrayList<INotificationObserver>>();
    }

    @Override
    public void setStatus(OrderStatus status) {
        this.status = status;
        notifyObservers(status);
    }

    @Override
    public OrderStatus getStatus() {
        return status;
    }

    @Override
    public String getOrderId() {
        return orderId;
    }

    @Override
    public void addObserver(INotificationObserver observer, OrderStatus status) {
        observersMap.computeIfAbsent(status,
                k -> new ArrayList<INotificationObserver>()).add(observer);
    }

    @Override
    public void removeObserver(OrderStatus status) {
        observersMap.remove(status);
    }

    @Override
    public void notifyObservers(OrderStatus status) {
        ArrayList<INotificationObserver> observerList = observersMap.getOrDefault(status,
                new ArrayList<INotificationObserver>());

        for (INotificationObserver observer : observerList) {
            observer.update(orderId);
        }
    }
}
