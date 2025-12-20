package P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_3_Payment_Service.Refactored_Code.services.impl;

import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_3_Payment_Service.Refactored_Code.services.IPaymentService;

public class PayPalPaymentService implements IPaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("Connecting to PayPal API...");
        System.out.println("Authenticating token...");
        System.out.println("Processing PayPal payment: $" + amount);
        System.out.println("PayPal Payment completed!");
    }
}
