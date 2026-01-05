package P3_Structural_Design_Patterns.P2_Adapter_Design_Pattern.Java_Example_1_Payment_Processing_System.Refactored_Code.models;

public abstract class PaymentProcessAdapter implements PaymentProcessor {
    protected String key = "";

    public PaymentProcessAdapter(String key) {
        this.key = key;
    }
}
