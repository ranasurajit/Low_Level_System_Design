package P1_SOLID_Principles.P5_DIP_Dependency_Inversion_Principle.Java_Example_1_Ride_Notification_System.Refactored_Code;

import java.util.ArrayList;
import java.util.List;

import P1_SOLID_Principles.P5_DIP_Dependency_Inversion_Principle.Java_Example_1_Ride_Notification_System.Refactored_Code.factory.NotificationFactory;
import P1_SOLID_Principles.P5_DIP_Dependency_Inversion_Principle.Java_Example_1_Ride_Notification_System.Refactored_Code.services.INotificationService;
import P1_SOLID_Principles.P5_DIP_Dependency_Inversion_Principle.Java_Example_1_Ride_Notification_System.Refactored_Code.utils.NotificationTypesEnum;

public class Main {
    public static void main(String[] args) {
        // creating list of all supported notication types
        List<INotificationService> notificationServices = new ArrayList<INotificationService>();
        INotificationService smsService = NotificationFactory.getNotificationService(NotificationTypesEnum.SMS);
        INotificationService emailService = NotificationFactory.getNotificationService(NotificationTypesEnum.EMAIL);
        INotificationService whatsappService = NotificationFactory
                .getNotificationService(NotificationTypesEnum.WHATSAPP);
        notificationServices.add(smsService);
        notificationServices.add(emailService);
        notificationServices.add(whatsappService);
        // passing list of all notification services to RideService
        RideService rideService = new RideService(notificationServices);
        // notify user via all notification modes
        rideService.completeRide("RIDE12345");
    }
}
