package P1_SOLID_Principles.P3_LSP_Liskov_Substitution_Principle.Java_Example_1_Ride_Calculator_With_Promo.Refactored_Code;

public abstract class FareRide extends Ride {

    public FareRide(double distanceInKm, double durationInMinutes) {
        super(distanceInKm, durationInMinutes);
    }

    public abstract double calculateFare();
}
