package P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_4_Shipping_Cost_Calculation_System.Refactored_Code.models;

public class Order {
    private double weightInKg;
    private double distanceInKm;
    private double orderValue;

    public Order(double weightInKg, double distanceInKm, double orderValue) {
        this.weightInKg = weightInKg;
        this.distanceInKm = distanceInKm;
        this.orderValue = orderValue;
    }

    public double getWeightInKg() {
        return weightInKg;
    }

    public double getDistanceInKm() {
        return distanceInKm;
    }

    public double getOrderValue() {
        return orderValue;
    }
}
