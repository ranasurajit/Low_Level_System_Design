package P3_Structural_Design_Patterns.P2_Adapter_Design_Pattern.Java_Example_1_Payment_Processing_System.Refactored_Code.models;

public class PayPalGateway {
    public void makePayment(String email, double amount) {
        System.out.println("Paid ₹" + amount + " using PayPal account: " + email);
    }
}
