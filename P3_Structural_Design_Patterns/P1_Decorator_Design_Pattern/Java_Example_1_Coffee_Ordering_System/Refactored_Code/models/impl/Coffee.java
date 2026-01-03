package P3_Structural_Design_Patterns.P1_Decorator_Design_Pattern.Java_Example_1_Coffee_Ordering_System.Refactored_Code.models.impl;

import P3_Structural_Design_Patterns.P1_Decorator_Design_Pattern.Java_Example_1_Coffee_Ordering_System.Refactored_Code.models.Beverage;

public class Coffee extends Beverage {
    @Override
    public double getCost() {
        return 50d;
    }

    @Override
    public String getDescription() {
        return "Coffee";
    }
}
