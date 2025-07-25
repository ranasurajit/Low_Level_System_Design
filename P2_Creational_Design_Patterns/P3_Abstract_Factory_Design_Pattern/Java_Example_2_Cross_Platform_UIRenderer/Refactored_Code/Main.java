package P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Refactored_Code;

import java.util.Scanner;

import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Refactored_Code.factory.GUIFactory;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Refactored_Code.factory.GUIFactoryProvider;
import P2_Creational_Design_Patterns.P3_Abstract_Factory_Design_Pattern.Java_Example_2_Cross_Platform_UIRenderer.Refactored_Code.utils.OsTypeEnum;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the OS type (WIN/MAC) : ");
        String input = scn.nextLine().toUpperCase();

        OsTypeEnum type = OsTypeEnum.valueOf(input);
        try {
            GUIFactory factory = GUIFactoryProvider.getFactory(type);
            Application application = new Application(factory);
            application.renderUI();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scn.close();
        }
    }
}
