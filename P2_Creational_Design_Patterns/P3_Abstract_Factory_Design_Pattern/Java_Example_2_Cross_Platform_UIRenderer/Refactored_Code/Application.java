package P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Refactored_Code;

import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Refactored_Code.components.Button;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Refactored_Code.components.TextBox;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Refactored_Code.factory.GUIFactory;

public class Application {
    private Button button;
    private TextBox textBox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.textBox = factory.createTextbox();
    }

    public void renderUI() {
        button.render();
        textBox.render();
    }
}
