package P3_Structural_Design_Patterns.P2_Adapter_Design_Pattern.Java_Example_1_Payment_Processing_System.Refactored_Code;

import P3_Structural_Design_Patterns.P2_Adapter_Design_Pattern.Java_Example_1_Payment_Processing_System.Refactored_Code.models.PayPalGateway;
import P3_Structural_Design_Patterns.P2_Adapter_Design_Pattern.Java_Example_1_Payment_Processing_System.Refactored_Code.models.UPIGateway;
import P3_Structural_Design_Patterns.P2_Adapter_Design_Pattern.Java_Example_1_Payment_Processing_System.Refactored_Code.models.impl.CreditCardPayment;
import P3_Structural_Design_Patterns.P2_Adapter_Design_Pattern.Java_Example_1_Payment_Processing_System.Refactored_Code.models.impl.PayPalGatewayAdapter;
import P3_Structural_Design_Patterns.P2_Adapter_Design_Pattern.Java_Example_1_Payment_Processing_System.Refactored_Code.models.impl.UPIGatewayAdapter;
import P3_Structural_Design_Patterns.P2_Adapter_Design_Pattern.Java_Example_1_Payment_Processing_System.Refactored_Code.services.PaymentService;

public class Main {
    public static void main(String[] args) {
        PaymentService creditCardService = new PaymentService(new CreditCardPayment());
        creditCardService.pay(500);

        PaymentService payPalService = new PaymentService(
                new PayPalGatewayAdapter("user@email.com", new PayPalGateway()));
        payPalService.pay(1200);

        PaymentService upiService = new PaymentService(new UPIGatewayAdapter("user@upi", new UPIGateway()));
        upiService.pay(300);
    }
}
