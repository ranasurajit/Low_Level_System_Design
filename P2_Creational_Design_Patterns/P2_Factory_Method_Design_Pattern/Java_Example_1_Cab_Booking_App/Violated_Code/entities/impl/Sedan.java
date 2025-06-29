package P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_1_Cab_Booking_App.Violated_Code.entities.impl;

import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_1_Cab_Booking_App.Violated_Code.entities.IRide;

public class Sedan implements IRide {
    @Override
    public void bookRide() {
        System.out.println("Sedan ride booked.");
    }
}
