package P4_Behavioral_Design_Patterns.P2_Java_Example_2_Shopping_Cart_System.Refactored_Code.strategies.impl;

import P4_Behavioral_Design_Patterns.P2_Java_Example_2_Shopping_Cart_System.Refactored_Code.strategies.ICartStrategy;

public class PercentageDiscountCartStrategy implements ICartStrategy {
    @Override
    public double getPriceAfterDiscount(double originalPrice, double discountPerc) {
        return originalPrice - Math.min(200.0, originalPrice * (discountPerc / 100));
    }
}
