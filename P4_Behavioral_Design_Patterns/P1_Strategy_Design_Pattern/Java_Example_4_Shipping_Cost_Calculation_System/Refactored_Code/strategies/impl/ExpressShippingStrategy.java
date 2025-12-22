package P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_4_Shipping_Cost_Calculation_System.Refactored_Code.strategies.impl;

import P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_4_Shipping_Cost_Calculation_System.Refactored_Code.models.Order;
import P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_4_Shipping_Cost_Calculation_System.Refactored_Code.strategies.IShippingStrategy;

public class ExpressShippingStrategy implements IShippingStrategy {
    @Override
    public double calculateShippingCost(Order order) {
        return order.getWeightInKg() * 8 + order.getDistanceInKm() * 1.5;
    }
}
