package P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.P2_Java_Example_2_Shopping_Cart_System.Refactored_Code.strategies.impl;

import P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.P2_Java_Example_2_Shopping_Cart_System.Refactored_Code.strategies.ICartStrategy;

public class FlatDiscountCartStrategy implements ICartStrategy {
    @Override
    public double getPriceAfterDiscount(double originalPrice, double discountPerc) {
        return originalPrice - (originalPrice * (discountPerc / 100));
    }
}
