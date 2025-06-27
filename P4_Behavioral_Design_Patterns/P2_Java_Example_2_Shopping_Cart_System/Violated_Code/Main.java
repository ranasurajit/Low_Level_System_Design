package P4_Behavioral_Design_Patterns.P2_Java_Example_2_Shopping_Cart_System.Violated_Code;

public class Main {
    public static void main(String[] args) {
        Cart flatCart = new Cart("FLAT");
        System.out.println("Flat Discount: ₹" + flatCart.calculateFinalPrice(500));

        Cart percentCart = new Cart("PERCENT");
        System.out.println("Percent Discount: ₹" + percentCart.calculateFinalPrice(500));

        Cart noDiscountCart = new Cart("NONE");
        System.out.println("No Discount: ₹" + noDiscountCart.calculateFinalPrice(500));
    }
}
