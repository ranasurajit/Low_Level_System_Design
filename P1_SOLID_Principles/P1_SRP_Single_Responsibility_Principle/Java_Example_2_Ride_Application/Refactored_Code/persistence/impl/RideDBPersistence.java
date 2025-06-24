package P1_SOLID_Principles.P1_SRP_Single_Responsibility_Principle.Java_Example_2_Ride_Application.Refactored_Code.persistence.impl;

import P1_SOLID_Principles.P1_SRP_Single_Responsibility_Principle.Java_Example_2_Ride_Application.Refactored_Code.RideDetails;
import P1_SOLID_Principles.P1_SRP_Single_Responsibility_Principle.Java_Example_2_Ride_Application.Refactored_Code.persistence.IDBPersistence;

public class RideDBPersistence implements IDBPersistence {
    private RideDetails ride;

    public RideDBPersistence(RideDetails ride) {
        this.ride = ride;
    }

    public void saveInvoiceToDB() {
        System.out.println("Saving invoice to database for ride: " + ride.getRideId());
        // Database logic (pretend JDBC or ORM here)
    }
}
