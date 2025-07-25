package P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Refactored_Code.factory;

import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Refactored_Code.factory.impl.MacGUIFactory;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Refactored_Code.factory.impl.WinGUIFactory;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Refactored_Code.utils.OsTypeEnum;

public class GUIFactoryProvider {
    public static GUIFactory getFactory(OsTypeEnum type) {
        GUIFactory factory;
        switch (type) {
            case WIN:
                factory = new WinGUIFactory();
                break;
            case MAC:
                factory = new MacGUIFactory();
                break;
            default:
                throw new IllegalArgumentException(type + " OS is unsupported.");
        }
        return factory;
    }
}
