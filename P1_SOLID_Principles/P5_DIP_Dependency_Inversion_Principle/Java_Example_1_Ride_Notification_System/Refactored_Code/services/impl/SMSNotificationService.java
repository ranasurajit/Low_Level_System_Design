package P1_SOLID_Principles.P5_DIP_Dependency_Inversion_Principle.Java_Example_1_Ride_Notification_System.Refactored_Code.services.impl;

import P1_SOLID_Principles.P5_DIP_Dependency_Inversion_Principle.Java_Example_1_Ride_Notification_System.Refactored_Code.services.INotificationService;
import P1_SOLID_Principles.P5_DIP_Dependency_Inversion_Principle.Java_Example_1_Ride_Notification_System.Refactored_Code.utils.NotificationTypesEnum;

public class SMSNotificationService implements INotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println(NotificationTypesEnum.SMS + " sent " + message);
    }
}
