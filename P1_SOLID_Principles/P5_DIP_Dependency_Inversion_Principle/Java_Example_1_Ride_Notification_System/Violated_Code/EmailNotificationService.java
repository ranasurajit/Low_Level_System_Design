package P1_SOLID_Principles.P5_DIP_Dependency_Inversion_Principle.Java_Example_1_Ride_Notification_System.Violated_Code;

public class EmailNotificationService {
    public void sendEmail(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}
