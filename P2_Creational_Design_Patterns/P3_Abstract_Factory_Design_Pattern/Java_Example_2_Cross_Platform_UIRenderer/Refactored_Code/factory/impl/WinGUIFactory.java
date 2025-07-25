package P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Refactored_Code.factory.impl;

import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Refactored_Code.components.Button;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Refactored_Code.components.TextBox;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Refactored_Code.components.win.WindowsButton;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Refactored_Code.components.win.WindowsTextBox;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Refactored_Code.factory.GUIFactory;

public class WinGUIFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextBox createTextbox() {
        return new WindowsTextBox();
    }
    
}
