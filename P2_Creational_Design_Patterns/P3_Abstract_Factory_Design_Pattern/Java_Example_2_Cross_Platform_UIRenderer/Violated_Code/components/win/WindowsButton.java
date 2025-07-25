package P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Violated_Code.components.win;

import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Violated_Code.components.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Windows Button");
    }
}
