package P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.providers;

import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.factories.RegionRideFactory;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.factories.impl.IndianRideFactory;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.factories.impl.USRideFactory;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.utils.RegionEnum;

public class RegionRideFactoryProvider {
    public static RegionRideFactory getFactory(RegionEnum type) {
        RegionRideFactory factory = null;
        switch (type) {
            case INDIA:
                factory = new IndianRideFactory();
                break;
            case USA:
                factory = new USRideFactory();
                break;
            default:
                throw new IllegalArgumentException("Invalid argument passed : " + type);
        }
        return factory;
    }
}
