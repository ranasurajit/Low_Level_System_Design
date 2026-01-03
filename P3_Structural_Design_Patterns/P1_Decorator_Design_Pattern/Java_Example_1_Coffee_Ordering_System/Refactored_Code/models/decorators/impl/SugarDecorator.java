package P3_Structural_Design_Patterns.P1_Decorator_Design_Pattern.Java_Example_1_Coffee_Ordering_System.Refactored_Code.models.decorators.impl;

import P3_Structural_Design_Patterns.P1_Decorator_Design_Pattern.Java_Example_1_Coffee_Ordering_System.Refactored_Code.models.Beverage;
import P3_Structural_Design_Patterns.P1_Decorator_Design_Pattern.Java_Example_1_Coffee_Ordering_System.Refactored_Code.models.decorators.BeverageDecorator;

public class SugarDecorator extends BeverageDecorator {

    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 5d;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Sugar";
    }
}
