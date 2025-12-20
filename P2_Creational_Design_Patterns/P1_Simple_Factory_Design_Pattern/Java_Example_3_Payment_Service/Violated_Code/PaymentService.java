package P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_3_Payment_Service.Violated_Code;

public class PaymentService {
    public void pay(String type, double amount) {
        if (type.equalsIgnoreCase("credit")) {
            System.out.println("Connecting to Visa/Mastercard gateway...");
            System.out.println("Performing fraud checks...");
            System.out.println("Charging credit card: $" + amount);
            System.out.println("Credit Card Payment processed successfully!");
        } else if (type.equalsIgnoreCase("paypal")) {
            System.out.println("Connecting to PayPal API...");
            System.out.println("Authenticating token...");
            System.out.println("Processing PayPal payment: $" + amount);
            System.out.println("PayPal Payment completed!");
        } else if (type.equalsIgnoreCase("upi")) {
            System.out.println("Connecting to UPI server...");
            System.out.println("Validating VPA...");
            System.out.println("Processing UPI payment: $" + amount);
            System.out.println("UPI Payment done!");
        } else {
            throw new IllegalArgumentException("Unknown payment type: " + type);
        }
    }
}
