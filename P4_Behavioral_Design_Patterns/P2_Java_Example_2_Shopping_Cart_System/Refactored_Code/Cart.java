package P4_Behavioral_Design_Patterns.P2_Java_Example_2_Shopping_Cart_System.Refactored_Code;

import P4_Behavioral_Design_Patterns.P2_Java_Example_2_Shopping_Cart_System.Refactored_Code.strategies.ICartStrategy;

public class Cart {
    ICartStrategy strategy = null;

    public Cart(ICartStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateFinalPrice(double originalPrice, double discountPerc) {
        return strategy.getPriceAfterDiscount(originalPrice, discountPerc);
    }
}
