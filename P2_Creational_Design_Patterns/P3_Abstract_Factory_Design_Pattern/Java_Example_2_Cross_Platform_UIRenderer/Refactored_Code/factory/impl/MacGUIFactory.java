package P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Refactored_Code.factory.impl;

import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Refactored_Code.components.Button;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Refactored_Code.components.TextBox;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Refactored_Code.components.mac.MacButton;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Refactored_Code.components.mac.MacTextBox;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Refactored_Code.factory.GUIFactory;

public class MacGUIFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextBox createTextbox() {
        return new MacTextBox();
    }

}
