package P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_1_Cab_Booking_App.Violated_Code;

import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_1_Cab_Booking_App.Violated_Code.rides.india.IndianMini;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_1_Cab_Booking_App.Violated_Code.rides.india.IndianSedan;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_1_Cab_Booking_App.Violated_Code.rides.usa.USCompact;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_1_Cab_Booking_App.Violated_Code.rides.usa.USLimousine;

public class Main {
    public static void main(String[] args) {
        // Hardcoded usage without abstract factory
        IndianMini mini = new IndianMini();
        mini.book();

        IndianSedan sedan = new IndianSedan();
        sedan.book();

        USCompact compact = new USCompact();
        compact.book();

        USLimousine limo = new USLimousine();
        limo.book();
    }
}
