package P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_4_Shipping_Cost_Calculation_System.Violated_Code;

public class ShippingCostCalculator {
    public double calculateShippingCost(ShippingType type, Order order) {
        if (type == ShippingType.STANDARD) {
            return order.getWeightInKg() * 5 + order.getDistanceInKm() * 1;
        } else if (type == ShippingType.EXPRESS) {
            return order.getWeightInKg() * 8 + order.getDistanceInKm() * 1.5;
        } else if (type == ShippingType.SAME_DAY) {
            return order.getWeightInKg() * 12 + order.getDistanceInKm() * 2;
        } else if (type == ShippingType.INTERNATIONAL) {
            return order.getWeightInKg() * 20 + order.getDistanceInKm() * 3 + 500;
        } else {
            throw new IllegalArgumentException("Unsupported shipping type");
        }
    }
}
