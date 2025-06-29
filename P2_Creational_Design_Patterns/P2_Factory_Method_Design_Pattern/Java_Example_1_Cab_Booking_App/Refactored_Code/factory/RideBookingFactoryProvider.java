package P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.factory;

import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.factory.impl.AutoRideBookingFactoryService;
import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.factory.impl.MiniRideBookingFactoryService;
import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.factory.impl.SUVRideBookingFactoryService;
import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.factory.impl.SedanRideBookingFactoryService;
import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.utils.RideTypeEnum;

public class RideBookingFactoryProvider {
    public static RideBookingFactoryService getRideBookingService(RideTypeEnum type) {
        RideBookingFactoryService service = null;
        switch (type) {
            case MINI:
                service = new MiniRideBookingFactoryService();
                break;
            case SEDAN:
                service = new SedanRideBookingFactoryService();
                break;
            case SUV:
                service = new SUVRideBookingFactoryService();
                break;
            case AUTO:
                service = new AutoRideBookingFactoryService();
                break;
            default:
                throw new IllegalArgumentException("Unknown type argument was passed " + type);
        }
        return service;
    }
}
