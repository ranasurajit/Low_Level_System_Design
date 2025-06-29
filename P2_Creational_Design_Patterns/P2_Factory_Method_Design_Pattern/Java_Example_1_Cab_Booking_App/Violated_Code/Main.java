package P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_1_Cab_Booking_App.Violated_Code;

import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_1_Cab_Booking_App.Violated_Code.services.RideBookingService;

public class Main {
    public static void main(String[] args) {
        RideBookingService service = new RideBookingService();
        service.bookRide("mini");
        service.bookRide("sedan");
        service.bookRide("suv");
    }
}
