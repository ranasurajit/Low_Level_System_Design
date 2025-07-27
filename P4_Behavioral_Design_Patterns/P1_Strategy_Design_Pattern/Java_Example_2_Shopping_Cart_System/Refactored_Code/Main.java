package P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_2_Shopping_Cart_System.Refactored_Code;

import P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_2_Shopping_Cart_System.Refactored_Code.strategies.impl.FlatDiscountCartStrategy;
import P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_2_Shopping_Cart_System.Refactored_Code.strategies.impl.NoDiscountCartStrategy;
import P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_2_Shopping_Cart_System.Refactored_Code.strategies.impl.PercentageDiscountCartStrategy;

public class Main {
    public static void main(String[] args) {
        Cart flatCart = new Cart(new FlatDiscountCartStrategy());
        System.out.println("Flat Discount: ₹" + flatCart.calculateFinalPrice(500, 50));

        Cart percentCart = new Cart(new PercentageDiscountCartStrategy());
        System.out.println("Percent Discount: ₹" + percentCart.calculateFinalPrice(500, 60));

        Cart noDiscountCart = new Cart(new NoDiscountCartStrategy());
        System.out.println("No Discount: ₹" + noDiscountCart.calculateFinalPrice(500, 10));
    }
}
