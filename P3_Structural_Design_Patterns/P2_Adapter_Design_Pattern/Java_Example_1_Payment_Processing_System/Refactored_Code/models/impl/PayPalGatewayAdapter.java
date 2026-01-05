package P3_Structural_Design_Patterns.P2_Adapter_Design_Pattern.Java_Example_1_Payment_Processing_System.Refactored_Code.models.impl;

import P3_Structural_Design_Patterns.P2_Adapter_Design_Pattern.Java_Example_1_Payment_Processing_System.Refactored_Code.models.PayPalGateway;
import P3_Structural_Design_Patterns.P2_Adapter_Design_Pattern.Java_Example_1_Payment_Processing_System.Refactored_Code.models.PaymentProcessAdapter;

public class PayPalGatewayAdapter extends PaymentProcessAdapter {
    protected PayPalGateway payPalGateway;

    public PayPalGatewayAdapter(String key, PayPalGateway payPalGateway) {
        super(key);
        this.payPalGateway = payPalGateway;
    }

    @Override
    public void processPayment(double amount) {
        payPalGateway.makePayment(key, amount);
    }
}
