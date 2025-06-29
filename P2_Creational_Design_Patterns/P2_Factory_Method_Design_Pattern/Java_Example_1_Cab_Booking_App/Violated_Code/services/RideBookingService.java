package P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_1_Cab_Booking_App.Violated_Code.services;

import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_1_Cab_Booking_App.Violated_Code.entities.IRide;
import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_1_Cab_Booking_App.Violated_Code.entities.impl.Mini;
import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_1_Cab_Booking_App.Violated_Code.entities.impl.SUV;
import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_1_Cab_Booking_App.Violated_Code.entities.impl.Sedan;

public class RideBookingService {
    public void bookRide(String type) {
        IRide ride;
        switch (type.toLowerCase()) {
            case "mini":
                ride = new Mini();
                break;
            case "sedan":
                ride = new Sedan();
                break;
            case "suv":
                ride = new SUV();
                break;
            default:
                throw new IllegalArgumentException("Invalid ride type");
        }
        ride.bookRide();
    }
}
