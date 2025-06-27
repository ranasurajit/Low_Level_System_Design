package P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_1_Notification_System.Refactored_Code.services.impl;

import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_1_Notification_System.Refactored_Code.services.INotificationService;

public class SMSNotificationService implements INotificationService {
    @Override
    public void send(String message) {
        System.out.println("Your OTP is : " + message);
    }
}
