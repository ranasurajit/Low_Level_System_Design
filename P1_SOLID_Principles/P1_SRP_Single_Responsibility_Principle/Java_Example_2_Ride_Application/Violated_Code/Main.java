package P1_SOLID_Principles.P1_SRP_Single_Responsibility_Principle.Java_Example_2_Ride_Application.Violated_Code;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create a ride
        RideInvoice rideInvoice = new RideInvoice("RIDE123", 12.5, 18.0, "john.doe@example.com");

        // Step 2: Calculate fare
        double fare = rideInvoice.calculateFare();
        System.out.println("Calculated Fare: ₹" + fare);

        // Step 3: Save invoice to DB
        rideInvoice.saveInvoiceToDB();

        // Step 4: Send invoice via email
        rideInvoice.sendInvoiceEmail();
    }
}
