package P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.factory;

import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.entities.IRide;

public abstract class RideBookingFactoryService {
    public void bookRide() {
        IRide ride = createRide();
        ride.bookRide();
    }

    public abstract IRide createRide();
}
