package P3_Structural_Design_Patterns.P2_Adapter_Design_Pattern.Java_Example_1_Payment_Processing_System.Refactored_Code.models;

public class UPIGateway {
    public void payUsingUPI(String upiId, double amount) {
        System.out.println("Paid ₹" + amount + " using UPI ID: " + upiId);
    }
}
