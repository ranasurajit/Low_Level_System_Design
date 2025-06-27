package P4_Behavioral_Design_Patterns.P2_Java_Example_2_Shopping_Cart_System.Violated_Code;

public class Cart {
    private String discountType;

    public Cart(String discountType) {
        this.discountType = discountType;
    }

    public double calculateFinalPrice(double originalPrice) {
        if (discountType.equals("FLAT")) {
            return originalPrice - 50;
        } else if (discountType.equals("PERCENT")) {
            return originalPrice * 0.9;
        } else {
            return originalPrice;
        }
    }
}
