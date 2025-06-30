package P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code;

import java.util.Scanner;

import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.entities.LuxuryRide;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.entities.StandardRide;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.factories.RegionRideFactory;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.providers.RegionRideFactoryProvider;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_1_Cab_Booking_App.Refactored_Code.utils.RegionEnum;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the make region (India/USA) : ");
        String input = scanner.nextLine().toUpperCase();
        try {
            RegionEnum region = RegionEnum.valueOf(input);
            RegionRideFactory factory = RegionRideFactoryProvider.getFactory(region);
            StandardRide standardRide = factory.createStandardRide();
            standardRide.book();
            LuxuryRide luxuryRide = factory.createLuxuryRide();
            luxuryRide.book();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        scanner.close();
    }
}
