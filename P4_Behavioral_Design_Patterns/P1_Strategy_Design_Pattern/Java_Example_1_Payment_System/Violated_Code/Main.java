package P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_1_Payment_System.Violated_Code;

public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        service.pay("CREDIT_CARD", 1000);
        service.pay("UPI", 750);
        service.pay("PAYPAL", 500);
        service.pay("CASH", 200);  // should print unsupported
    }
}
