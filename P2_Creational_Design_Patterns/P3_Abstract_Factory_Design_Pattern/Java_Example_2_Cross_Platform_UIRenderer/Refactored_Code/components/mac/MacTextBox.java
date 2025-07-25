package P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Refactored_Code.components.mac;

import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Refactored_Code.components.TextBox;

public class MacTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Rendering Mac TextBox");
    }
}
