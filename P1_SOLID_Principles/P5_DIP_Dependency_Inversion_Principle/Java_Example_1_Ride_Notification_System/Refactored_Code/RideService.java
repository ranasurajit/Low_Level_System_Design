package P1_SOLID_Principles.P5_DIP_Dependency_Inversion_Principle.Java_Example_1_Ride_Notification_System.Refactored_Code;

import java.util.List;

import P1_SOLID_Principles.P5_DIP_Dependency_Inversion_Principle.Java_Example_1_Ride_Notification_System.Refactored_Code.services.INotificationService;

public class RideService {
    List<INotificationService> notificationServices;

    public RideService(List<INotificationService> notificationServices) {
        this.notificationServices = notificationServices;
    }

    public void completeRide(String rideId) {
        System.out.println("Ride " + rideId + " completed.");
        for (INotificationService notifyService : notificationServices) {
            notifyService.sendNotification("for completion of ride : " + rideId);
        }
    }
}
