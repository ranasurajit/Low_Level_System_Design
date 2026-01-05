package P3_Structural_Design_Patterns.P2_Adapter_Design_Pattern.Java_Example_1_Payment_Processing_System.Refactored_Code.models.impl;

import P3_Structural_Design_Patterns.P2_Adapter_Design_Pattern.Java_Example_1_Payment_Processing_System.Refactored_Code.models.PaymentProcessAdapter;
import P3_Structural_Design_Patterns.P2_Adapter_Design_Pattern.Java_Example_1_Payment_Processing_System.Refactored_Code.models.UPIGateway;

public class UPIGatewayAdapter extends PaymentProcessAdapter {
    protected UPIGateway upiGateway;

    public UPIGatewayAdapter(String key, UPIGateway upiGateway) {
        super(key);
        this.upiGateway = upiGateway;
    }

    @Override
    public void processPayment(double amount) {
        upiGateway.payUsingUPI(key, amount);
    }
}
