package P3_Structural_Design_Patterns.P2_Adapter_Design_Pattern.Java_Example_1_Payment_Processing_System.Violated_Code;

import P3_Structural_Design_Patterns.P2_Adapter_Design_Pattern.Java_Example_1_Payment_Processing_System.Violated_Code.services.PaymentService;

public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        service.pay("CREDIT_CARD", 500);
        service.pay("PAYPAL", 1200);
        service.pay("UPI", 300);
    }
}
