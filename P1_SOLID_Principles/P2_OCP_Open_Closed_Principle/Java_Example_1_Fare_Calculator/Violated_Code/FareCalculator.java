package P1_SOLID_Principles.P2_OCP_Open_Closed_Principle.Java_Example_1_Fare_Calculator.Violated_Code;

public class FareCalculator {
    public double calculateFare(String rideType, double distanceInKm, double durationInMinutes) {
        if (rideType.equals("STANDARD")) {
            return distanceInKm * 10 + durationInMinutes * 2;
        } else if (rideType.equals("LUXURY")) {
            return distanceInKm * 15 + durationInMinutes * 4 + 50; // luxury surcharge
        } else if (rideType.equals("ELECTRIC")) {
            return distanceInKm * 8 + durationInMinutes * 2; // eco discount
        } else {
            throw new IllegalArgumentException("Unsupported ride type: " + rideType);
        }
    }
}
