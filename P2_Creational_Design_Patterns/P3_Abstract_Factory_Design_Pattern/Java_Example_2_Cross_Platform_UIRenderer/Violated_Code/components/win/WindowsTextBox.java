package P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Violated_Code.components.win;

import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Violated_Code.components.TextBox;

public class WindowsTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Rendering Windows TextBox");
    }
}
