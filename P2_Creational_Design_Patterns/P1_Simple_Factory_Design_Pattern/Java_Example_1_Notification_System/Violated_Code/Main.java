package P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_1_Notification_System.Violated_Code;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        service.send("EMAIL", "Welcome to our platform!");
        service.send("SMS", "Your OTP is 123456.");
        service.send("PUSH", "Don't miss our latest update.");
        service.send("WHATSAPP", "This should not be supported.");
    }
}
