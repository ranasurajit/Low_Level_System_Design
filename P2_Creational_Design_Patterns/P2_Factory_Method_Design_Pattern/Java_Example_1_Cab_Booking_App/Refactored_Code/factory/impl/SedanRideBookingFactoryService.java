package P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.factory.impl;

import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.entities.IRide;
import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.entities.impl.Sedan;
import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.factory.RideBookingFactoryService;

public class SedanRideBookingFactoryService extends RideBookingFactoryService {
    @Override
    public IRide createRide() {
        return new Sedan();
    }
}
