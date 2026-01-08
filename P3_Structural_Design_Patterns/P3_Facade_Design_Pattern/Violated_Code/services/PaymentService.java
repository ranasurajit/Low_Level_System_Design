package P3_Structural_Design_Patterns.P3_Facade_Design_Pattern.Violated_Code.services;

public class PaymentService {
    public boolean makePayment(double amount) {
        System.out.println("Processing payment of ₹" + amount);
        return true;
    }
}
