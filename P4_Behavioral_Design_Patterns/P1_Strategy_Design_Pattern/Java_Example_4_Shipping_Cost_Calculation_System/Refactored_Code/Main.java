package P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_4_Shipping_Cost_Calculation_System.Refactored_Code;

import P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_4_Shipping_Cost_Calculation_System.Refactored_Code.models.Order;
import P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_4_Shipping_Cost_Calculation_System.Refactored_Code.services.ShippingService;
import P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_4_Shipping_Cost_Calculation_System.Refactored_Code.strategies.impl.ExpressShippingStrategy;
import P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_4_Shipping_Cost_Calculation_System.Refactored_Code.strategies.impl.InternationalShippingStrategy;
import P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_4_Shipping_Cost_Calculation_System.Refactored_Code.strategies.impl.SameDayShippingStrategy;
import P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_4_Shipping_Cost_Calculation_System.Refactored_Code.strategies.impl.StandardShippingStrategy;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(
                10.0, // weight in kg
                120.0, // distance in km
                5000.0 // order value
        );
        ShippingService standardService = new ShippingService(new StandardShippingStrategy(), order);
        ShippingService expressService = new ShippingService(new ExpressShippingStrategy(), order);
        ShippingService sameDayService = new ShippingService(new SameDayShippingStrategy(), order);
        ShippingService internationalService = new ShippingService(new InternationalShippingStrategy(), order);

        double standardCost = standardService.calculateShippingCost();
        double expressCost = expressService.calculateShippingCost();
        double sameDayCost = sameDayService.calculateShippingCost();
        double internationalCost = internationalService.calculateShippingCost();

        System.out.println("Standard Shipping Cost: ₹" + standardCost);
        System.out.println("Express Shipping Cost: ₹" + expressCost);
        System.out.println("Same Day Shipping Cost: ₹" + sameDayCost);
        System.out.println("International Shipping Cost: ₹" + internationalCost);
    }
}
