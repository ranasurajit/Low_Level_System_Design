package P3_Structural_Design_Patterns.P1_Decorator_Design_Pattern.Java_Example_1_Coffee_Ordering_System.Refactored_Code;

import P3_Structural_Design_Patterns.P1_Decorator_Design_Pattern.Java_Example_1_Coffee_Ordering_System.Refactored_Code.models.Beverage;
import P3_Structural_Design_Patterns.P1_Decorator_Design_Pattern.Java_Example_1_Coffee_Ordering_System.Refactored_Code.models.decorators.impl.CaramelDecorator;
import P3_Structural_Design_Patterns.P1_Decorator_Design_Pattern.Java_Example_1_Coffee_Ordering_System.Refactored_Code.models.decorators.impl.MilkDecorator;
import P3_Structural_Design_Patterns.P1_Decorator_Design_Pattern.Java_Example_1_Coffee_Ordering_System.Refactored_Code.models.decorators.impl.SugarDecorator;
import P3_Structural_Design_Patterns.P1_Decorator_Design_Pattern.Java_Example_1_Coffee_Ordering_System.Refactored_Code.models.decorators.impl.WhippedCreamDecorator;
import P3_Structural_Design_Patterns.P1_Decorator_Design_Pattern.Java_Example_1_Coffee_Ordering_System.Refactored_Code.models.impl.Coffee;

public class Main {
    public static void main(String[] args) {
        Beverage coffee1 = new MilkDecorator(new Coffee());
        System.out.println(coffee1.getDescription());
        System.out.println("Cost: ₹" + coffee1.getCost());

        Beverage coffee2 = new MilkDecorator(new SugarDecorator(new WhippedCreamDecorator(new Coffee())));
        System.out.println(coffee2.getDescription());
        System.out.println("Cost: ₹" + coffee2.getCost());

        Beverage coffee3 = new MilkDecorator(
                new SugarDecorator(new WhippedCreamDecorator(new CaramelDecorator(new Coffee()))));
        System.out.println(coffee3.getDescription());
        System.out.println("Cost: ₹" + coffee3.getCost());
    }
}
