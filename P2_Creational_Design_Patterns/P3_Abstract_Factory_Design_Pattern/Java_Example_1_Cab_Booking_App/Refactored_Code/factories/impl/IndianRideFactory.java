package P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.factories.impl;

import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.entities.LuxuryRide;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.entities.StandardRide;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.entities.impl.IndianMini;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.entities.impl.IndianSedan;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.factories.RegionRideFactory;

public class IndianRideFactory implements RegionRideFactory {
    @Override
    public StandardRide createStandardRide() {
        return new IndianMini();
    }

    @Override
    public LuxuryRide createLuxuryRide() {
        return new IndianSedan();
    }
}
