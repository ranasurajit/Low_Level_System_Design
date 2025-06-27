package P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_1_Notification_System.Refactored_Code;

import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_1_Notification_System.Refactored_Code.factory.NotificationFactory;
import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_1_Notification_System.Refactored_Code.services.INotificationService;
import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_1_Notification_System.Refactored_Code.utils.NotificationTypesEnum;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            INotificationService emailService = NotificationFactory.getNotificationService(NotificationTypesEnum.EMAIL);
            emailService.send("Welcome to our platform!");

            INotificationService smsService = NotificationFactory.getNotificationService(NotificationTypesEnum.SMS);
            smsService.send("Your OTP is 123456.");

            INotificationService pushService = NotificationFactory.getNotificationService(NotificationTypesEnum.PUSH);
            pushService.send("Don't miss our latest update.");

            // Not supported - throws exception
            INotificationService whatsAppService = NotificationFactory
                    .getNotificationService(NotificationTypesEnum.WHATSAPP);
            whatsAppService.send("This should not be supported.");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
