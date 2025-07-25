package P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Violated_Code;

import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Violated_Code.components.Button;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Violated_Code.components.TextBox;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Violated_Code.components.mac.MacButton;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Violated_Code.components.mac.MacTextBox;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Violated_Code.components.win.WindowsButton;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Violated_Code.components.win.WindowsTextBox;

public class Application {
    private Button button;
    private TextBox textBox;

    public Application(String os) {
        if (os.equalsIgnoreCase("mac")) {
            button = new MacButton();
            textBox = new MacTextBox();
        } else if (os.equalsIgnoreCase("windows")) {
            button = new WindowsButton();
            textBox = new WindowsTextBox();
        } else {
            throw new IllegalArgumentException("Unsupported OS: " + os);
        }
    }

    public void renderUI() {
        button.render();
        textBox.render();
    }
}
