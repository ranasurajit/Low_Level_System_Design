package P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_1_Payment_System.Refactored_Code.strategies.impl;

import P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_1_Payment_System.Refactored_Code.strategies.IPaymentStrategy;

public class PayPalPaymentStrategy implements IPaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using PayPal.");
    }
}
