package P1_SOLID_Principles.P2_OCP_Open_Closed_Principle.Java_Example_1_Fare_Calculator.Violated_Code;

public class Main {
    public static void main(String[] args) {
        FareCalculator calculator = new FareCalculator();

        double standardFare = calculator.calculateFare("STANDARD", 10, 15);
        System.out.println("Standard Ride Fare: ₹" + standardFare);

        double luxuryFare = calculator.calculateFare("LUXURY", 10, 15);
        System.out.println("Luxury Ride Fare: ₹" + luxuryFare);

        double electricFare = calculator.calculateFare("ELECTRIC", 10, 15);
        System.out.println("Electric Ride Fare: ₹" + electricFare);

        // Uncomment to test unsupported ride type
        // calculator.calculateFare("BIKE", 10, 15);
    }
}
