package P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.entities.impl;

import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.entities.LuxuryRide;

public class USLimousine implements LuxuryRide {
    @Override
    public void book() {
        System.out.println("Booked US Limousine");
    }
}
