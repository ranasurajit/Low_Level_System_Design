package P1_SOLID_Principles.P5_DIP_Dependency_Inversion_Principle.Java_Example_1_Ride_Notification_System.Violated_Code;

public class Main {
    public static void main(String[] args) {
        RideService rideService = new RideService();
        rideService.completeRide("RIDE12345");
    }
}
