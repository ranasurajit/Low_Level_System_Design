package P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_3_Payment_Service.Violated_Code;

public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        service.pay("credit", 500);
        service.pay("paypal", 250);
        service.pay("upi", 100);
        // service.pay("bitcoin", 999); // will throw exception
    }
}
