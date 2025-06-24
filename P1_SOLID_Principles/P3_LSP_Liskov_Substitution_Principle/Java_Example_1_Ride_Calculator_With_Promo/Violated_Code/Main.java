package P1_SOLID_Principles.P3_LSP_Liskov_Substitution_Principle.Java_Example_1_Ride_Calculator_With_Promo.Violated_Code;

public class Main {
    public static void main(String[] args) {
        Ride standardRide = new StandardRide(10, 15);
        System.out.println("Standard Ride Fare: ₹" + standardRide.calculateFare());

        Ride freePromoRide = new FreePromoRide(10, 15);
        try {
            System.out.println("Free Promo Ride Fare: ₹" + freePromoRide.calculateFare());
        } catch (UnsupportedOperationException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
