package P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_4_Shipping_Cost_Calculation_System.Violated_Code;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(
                10.0, // weight in kg
                120.0, // distance in km
                5000.0 // order value
        );

        ShippingCostCalculator calculator = new ShippingCostCalculator();

        double standardCost = calculator.calculateShippingCost(
                ShippingType.STANDARD,
                order);

        double expressCost = calculator.calculateShippingCost(
                ShippingType.EXPRESS,
                order);

        double sameDayCost = calculator.calculateShippingCost(
                ShippingType.SAME_DAY,
                order);

        double internationalCost = calculator.calculateShippingCost(
                ShippingType.INTERNATIONAL,
                order);

        System.out.println("Standard Shipping Cost: ₹" + standardCost);
        System.out.println("Express Shipping Cost: ₹" + expressCost);
        System.out.println("Same Day Shipping Cost: ₹" + sameDayCost);
        System.out.println("International Shipping Cost: ₹" + internationalCost);
    }
}
