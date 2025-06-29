package P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.entities.impl;

import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.entities.IRide;

public class Auto implements IRide {
    @Override
    public void bookRide() {
        System.out.println("Auto ride booked.");
    }
}
