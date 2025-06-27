package P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_1_Notification_System.Refactored_Code.factory;

import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_1_Notification_System.Refactored_Code.services.INotificationService;
import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_1_Notification_System.Refactored_Code.services.impl.EmailNotificationService;
import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_1_Notification_System.Refactored_Code.services.impl.PushNotificationService;
import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_1_Notification_System.Refactored_Code.services.impl.SMSNotificationService;
import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_1_Notification_System.Refactored_Code.utils.NotificationTypesEnum;

public class NotificationFactory {
    /**
     * Factory method to create notification service instances based on type.
     * 
     * ⚠️ IMPORTANT:
     * Just adding a new value in NotificationTypesEnum (like WHATSAPP)
     * does NOT automatically make it supported.
     * You must also:
     * 1. Create a concrete implementation of INotificationService
     * 2. Add its handling in the switch block below.
     */
    public static INotificationService getNotificationService(NotificationTypesEnum type) {
        INotificationService service = null;
        switch (type) {
            case EMAIL:
                service = new EmailNotificationService();
                break;
            case SMS:
                service = new SMSNotificationService();
                break;
            case PUSH:
                service = new PushNotificationService();
                break;
            // 🚨 Missing case for WHATSAPP — not supported yet
            default:
                throw new IllegalArgumentException("Invalid type argument passed : " + type);
        }
        return service;
    }
}
