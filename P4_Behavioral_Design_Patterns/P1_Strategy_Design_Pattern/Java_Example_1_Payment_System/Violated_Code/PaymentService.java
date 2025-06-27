package P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_1_Payment_System.Violated_Code;

public class PaymentService {
    public void pay(String method, double amount) {
        if (method.equals("CREDIT_CARD")) {
            System.out.println("Paid ₹" + amount + " using Credit Card.");
        } else if (method.equals("UPI")) {
            System.out.println("Paid ₹" + amount + " using UPI.");
        } else if (method.equals("PAYPAL")) {
            System.out.println("Paid ₹" + amount + " using PayPal.");
        } else {
            System.out.println("Unsupported payment method.");
        }
    }
}
