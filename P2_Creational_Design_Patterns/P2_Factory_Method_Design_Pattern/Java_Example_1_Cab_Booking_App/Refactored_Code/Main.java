package P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code;

import java.util.Scanner;

import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.factory.RideBookingFactoryProvider;
import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.factory.RideBookingFactoryService;
import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.utils.RideTypeEnum;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter an input (e.g: MINI, SEDAN, SUV or AUTO) : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();
        try {
            RideTypeEnum type = RideTypeEnum.valueOf(input);
            RideBookingFactoryService service = RideBookingFactoryProvider.getRideBookingService(type);
            service.bookRide();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        scanner.close();
    }
}
