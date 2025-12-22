package P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_4_Shipping_Cost_Calculation_System.Refactored_Code.services;

import P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_4_Shipping_Cost_Calculation_System.Refactored_Code.models.Order;
import P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_4_Shipping_Cost_Calculation_System.Refactored_Code.strategies.IShippingStrategy;

public class ShippingService {
    private IShippingStrategy strategy = null;
    private Order order;

    public ShippingService(IShippingStrategy strategy, Order order) {
        this.strategy = strategy;
        this.order = order;
    }

    public double calculateShippingCost() {
        return strategy.calculateShippingCost(order);
    }
}
