package P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_3_Payment_Service.Refactored_Code.services.impl;

import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_3_Payment_Service.Refactored_Code.services.IPaymentService;

public class CreditPaymentService implements IPaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("Connecting to Visa/Mastercard gateway...");
        System.out.println("Performing fraud checks...");
        System.out.println("Charging credit card: $" + amount);
        System.out.println("Credit Card Payment processed successfully!");
    }
}
