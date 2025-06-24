package P1_SOLID_Principles.P5_DIP_Dependency_Inversion_Principle.Java_Example_1_Ride_Notification_System.Refactored_Code.factory;

import P1_SOLID_Principles.P5_DIP_Dependency_Inversion_Principle.Java_Example_1_Ride_Notification_System.Refactored_Code.services.INotificationService;
import P1_SOLID_Principles.P5_DIP_Dependency_Inversion_Principle.Java_Example_1_Ride_Notification_System.Refactored_Code.services.impl.EmailNotificationService;
import P1_SOLID_Principles.P5_DIP_Dependency_Inversion_Principle.Java_Example_1_Ride_Notification_System.Refactored_Code.services.impl.SMSNotificationService;
import P1_SOLID_Principles.P5_DIP_Dependency_Inversion_Principle.Java_Example_1_Ride_Notification_System.Refactored_Code.services.impl.WhatsAppNotificationService;
import P1_SOLID_Principles.P5_DIP_Dependency_Inversion_Principle.Java_Example_1_Ride_Notification_System.Refactored_Code.utils.NotificationTypesEnum;

public class NotificationFactory {
    public static INotificationService getNotificationService(NotificationTypesEnum type) {
        INotificationService service = null;
        switch (type) {
            case SMS:
                service = new SMSNotificationService();
                break;
            case EMAIL:
                service = new EmailNotificationService();
                break;
            case WHATSAPP:
                service = new WhatsAppNotificationService();
                break;
            default:
                throw new IllegalArgumentException("Invalid type of notication declared : " + type);
        }
        return service;
    }
}
