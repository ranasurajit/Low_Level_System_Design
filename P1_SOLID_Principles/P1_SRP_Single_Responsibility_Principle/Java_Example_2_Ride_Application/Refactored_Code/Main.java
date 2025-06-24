package P1_SOLID_Principles.P1_SRP_Single_Responsibility_Principle.Java_Example_2_Ride_Application.Refactored_Code;

import P1_SOLID_Principles.P1_SRP_Single_Responsibility_Principle.Java_Example_2_Ride_Application.Refactored_Code.persistence.impl.RideDBPersistence;
import P1_SOLID_Principles.P1_SRP_Single_Responsibility_Principle.Java_Example_2_Ride_Application.Refactored_Code.reporter.impl.EmailInvoiceGenerator;

public class Main {
    public static void main(String[] args) {
        // created user
        UserDetails user = new UserDetails("customer106", "John Doe", "john.doe@example.com");
        // created a ride
        RideDetails ride = new RideDetails("RIDE123");
        // assigned ride to user
        user.assignRide(ride);
        // updated time and distance to ride
        ride.setDistance(12.5);
        ride.setDuration(18.0);
        // updated ride details for user
        user.assignRide(ride);
        // created fare calculator object and calculated fare for the ride
        FareCalculator calculator = new FareCalculator(ride);
        double fare = calculator.calculateFare();
        System.out.println("Calculated Fare: ₹" + fare);
        // persist the fare record to DB
        RideDBPersistence dbPersistence = new RideDBPersistence(ride);
        dbPersistence.saveInvoiceToDB();
        // generate invoice and send it to user email
        EmailInvoiceGenerator generator = new EmailInvoiceGenerator(user);
        generator.sendInvoice();
    }
}
