package P1_SOLID_Principles.P3_LSP_Liskov_Substitution_Principle.Java_Example_1_Ride_Calculator_With_Promo.Violated_Code;

public class FreePromoRide extends Ride {
    public FreePromoRide(double distanceInKm, double durationInMinutes) {
        super(distanceInKm, durationInMinutes);
    }

    @Override
    public double calculateFare() {
        throw new UnsupportedOperationException("Free rides do not calculate fare.");
    }
}
