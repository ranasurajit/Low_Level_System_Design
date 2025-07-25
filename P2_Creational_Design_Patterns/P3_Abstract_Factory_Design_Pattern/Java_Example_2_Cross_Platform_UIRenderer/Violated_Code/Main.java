package P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Violated_Code;

public class Main {
    public static void main(String[] args) {
        Application app1 = new Application("mac");
        app1.renderUI();

        Application app2 = new Application("windows");
        app2.renderUI();
    }
}
