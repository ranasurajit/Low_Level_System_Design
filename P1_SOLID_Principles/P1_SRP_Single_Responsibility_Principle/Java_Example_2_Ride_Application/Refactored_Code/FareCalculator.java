package P1_SOLID_Principles.P1_SRP_Single_Responsibility_Principle.Java_Example_2_Ride_Application.Refactored_Code;

public class FareCalculator {
    private RideDetails ride;

    public FareCalculator(RideDetails ride) {
        this.ride = ride;
    }

    public double calculateFare() {
        return this.ride.getDistance() * 10 + this.ride.getDuration() * 2; // base rate logic
    }
}
