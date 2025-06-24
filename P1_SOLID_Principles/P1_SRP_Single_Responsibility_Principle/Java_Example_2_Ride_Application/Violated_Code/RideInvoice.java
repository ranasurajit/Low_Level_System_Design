
package P1_SOLID_Principles.P1_SRP_Single_Responsibility_Principle.Java_Example_2_Ride_Application.Violated_Code;

public class RideInvoice {
    private String rideId;
    private double distanceInKm;
    private double durationInMinutes;
    private String customerEmail;

    public RideInvoice(String rideId, double distanceInKm, double durationInMinutes, String customerEmail) {
        this.rideId = rideId;
        this.distanceInKm = distanceInKm;
        this.durationInMinutes = durationInMinutes;
        this.customerEmail = customerEmail;
    }

    public double calculateFare() {
        return distanceInKm * 10 + durationInMinutes * 2; // base rate logic
    }

    public void saveInvoiceToDB() {
        System.out.println("Saving invoice to database for ride: " + rideId);
        // Database logic (pretend JDBC or ORM here)
    }

    public void sendInvoiceEmail() {
        System.out.println("Sending invoice email to: " + customerEmail);
        // Email logic (pretend SMTP code here)
    }
}
