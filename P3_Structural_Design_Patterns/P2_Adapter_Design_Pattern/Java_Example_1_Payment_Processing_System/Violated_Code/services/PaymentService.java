package P3_Structural_Design_Patterns.P2_Adapter_Design_Pattern.Java_Example_1_Payment_Processing_System.Violated_Code.services;

import P3_Structural_Design_Patterns.P2_Adapter_Design_Pattern.Java_Example_1_Payment_Processing_System.Violated_Code.models.PayPalGateway;
import P3_Structural_Design_Patterns.P2_Adapter_Design_Pattern.Java_Example_1_Payment_Processing_System.Violated_Code.models.UPIGateway;
import P3_Structural_Design_Patterns.P2_Adapter_Design_Pattern.Java_Example_1_Payment_Processing_System.Violated_Code.models.impl.CreditCardPayment;

public class PaymentService {
    public void pay(String paymentType, double amount) {
        if (paymentType.equals("CREDIT_CARD")) {
            new CreditCardPayment().processPayment(amount);

        } else if (paymentType.equals("PAYPAL")) {
            PayPalGateway paypal = new PayPalGateway();
            paypal.makePayment("user@email.com", amount);

        } else if (paymentType.equals("UPI")) {
            UPIGateway upi = new UPIGateway();
            upi.payUsingUPI("user@upi", amount);
        }
    }
}
