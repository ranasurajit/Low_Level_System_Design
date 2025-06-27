package P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_1_Payment_System.Refactored_Code;

import P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_1_Payment_System.Refactored_Code.strategies.IPaymentStrategy;

public class PaymentService {
    IPaymentStrategy strategy = null;

    public PaymentService(IPaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay(double amount) {
        strategy.pay(amount);
    }
}
