package P1_SOLID_Principles.P1_SRP_Single_Responsibility_Principle.Java_Example_2_Ride_Application.Refactored_Code;

public class RideDetails {
    private String rideId;
    private double distanceInKm;
    private double durationInMinutes;

    public RideDetails(String rideId) {
        this.rideId = rideId;
    }

    public void setDistance(double distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public void setDuration(double durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public String getRideId() {
        return this.rideId;
    }

    public double getDuration() {
        return this.durationInMinutes;
    }

    public double getDistance() {
        return this.distanceInKm;
    }
}
