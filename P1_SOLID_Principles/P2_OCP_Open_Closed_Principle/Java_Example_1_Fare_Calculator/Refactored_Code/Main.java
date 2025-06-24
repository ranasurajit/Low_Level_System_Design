package P1_SOLID_Principles.P2_OCP_Open_Closed_Principle.Java_Example_1_Fare_Calculator.Refactored_Code;

import P1_SOLID_Principles.P2_OCP_Open_Closed_Principle.Java_Example_1_Fare_Calculator.Refactored_Code.factory.FareCalculatorFactory;
import P1_SOLID_Principles.P2_OCP_Open_Closed_Principle.Java_Example_1_Fare_Calculator.Refactored_Code.service.IFareCalculator;

public class Main {
    public static void main(String[] args) {
        IFareCalculator stdCalculator = FareCalculatorFactory.getCalculator("Standard");
        double standardFare = stdCalculator.calculateFare(10, 15);
        System.out.println("Standard Ride Fare: ₹" + standardFare);

        IFareCalculator luxCalculator = FareCalculatorFactory.getCalculator("Luxury");
        double luxuryFare = luxCalculator.calculateFare(10, 15);
        System.out.println("Luxury Ride Fare: ₹" + luxuryFare);

        IFareCalculator elecCalculator = FareCalculatorFactory.getCalculator("Electric");
        double electricFare = elecCalculator.calculateFare(10, 15);
        System.out.println("Electric Ride Fare: ₹" + electricFare);

        // Exception Test Code
        // IFareCalculator unknownCalculator =
        // FareCalculatorFactory.getCalculator("Unknown");
        // double unknownFare = unknownCalculator.calculateFare(10, 15);
        // System.out.println("Electric Ride Fare: ₹" + unknownFare);
    }
}
