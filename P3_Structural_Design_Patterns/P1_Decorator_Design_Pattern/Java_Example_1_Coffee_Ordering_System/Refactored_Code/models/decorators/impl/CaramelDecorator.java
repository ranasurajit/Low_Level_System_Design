package P3_Structural_Design_Patterns.P1_Decorator_Design_Pattern.Java_Example_1_Coffee_Ordering_System.Refactored_Code.models.decorators.impl;

import P3_Structural_Design_Patterns.P1_Decorator_Design_Pattern.Java_Example_1_Coffee_Ordering_System.Refactored_Code.models.Beverage;
import P3_Structural_Design_Patterns.P1_Decorator_Design_Pattern.Java_Example_1_Coffee_Ordering_System.Refactored_Code.models.decorators.BeverageDecorator;

public class CaramelDecorator extends BeverageDecorator {

    public CaramelDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 25d;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Caramel";
    }
}
