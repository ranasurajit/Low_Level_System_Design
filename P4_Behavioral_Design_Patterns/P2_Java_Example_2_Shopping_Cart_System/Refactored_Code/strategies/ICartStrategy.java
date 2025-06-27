package P4_Behavioral_Design_Patterns.P2_Java_Example_2_Shopping_Cart_System.Refactored_Code.strategies;

public interface ICartStrategy {
    public double getPriceAfterDiscount(double originalPrice, double discountPerc);
}
