package P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_3_Payment_Service.Refactored_Code.services.impl;

import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_3_Payment_Service.Refactored_Code.services.IPaymentService;

public class UPIPaymentService implements IPaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("Connecting to UPI server...");
        System.out.println("Validating VPA...");
        System.out.println("Processing UPI payment: $" + amount);
        System.out.println("UPI Payment done!");
    }
}
