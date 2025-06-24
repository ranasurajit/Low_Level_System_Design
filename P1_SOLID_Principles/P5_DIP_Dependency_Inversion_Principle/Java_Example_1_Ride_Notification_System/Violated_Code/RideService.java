package P1_SOLID_Principles.P5_DIP_Dependency_Inversion_Principle.Java_Example_1_Ride_Notification_System.Violated_Code;

public class RideService {
    private EmailNotificationService emailService = new EmailNotificationService();
    private SMSNotificationService smsService = new SMSNotificationService();

    public void completeRide(String rideId) {
        System.out.println("Ride " + rideId + " completed.");
        emailService.sendEmail("Your ride " + rideId + " is complete.");
        smsService.sendSMS("Ride " + rideId + " complete. Thanks!");
    }
}
