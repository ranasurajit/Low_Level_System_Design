package P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_1_Notification_System.Violated_Code;

public class NotificationService {
    public void send(String type, String message) {
        if (type.equals("EMAIL")) {
            System.out.println("Sending Email: " + message);
        } else if (type.equals("SMS")) {
            System.out.println("Sending SMS: " + message);
        } else if (type.equals("PUSH")) {
            System.out.println("Sending Push Notification: " + message);
        } else {
            System.out.println("Invalid notification type.");
        }
    }
}
