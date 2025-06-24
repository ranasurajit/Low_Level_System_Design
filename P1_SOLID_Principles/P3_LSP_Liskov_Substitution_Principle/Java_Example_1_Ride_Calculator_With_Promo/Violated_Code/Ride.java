package P1_SOLID_Principles.P3_LSP_Liskov_Substitution_Principle.Java_Example_1_Ride_Calculator_With_Promo.Violated_Code;

public abstract class Ride {
    protected double distanceInKm;
    protected double durationInMinutes;

    public Ride(double distanceInKm, double durationInMinutes) {
        this.distanceInKm = distanceInKm;
        this.durationInMinutes = durationInMinutes;
    }

    public abstract double calculateFare();
}
