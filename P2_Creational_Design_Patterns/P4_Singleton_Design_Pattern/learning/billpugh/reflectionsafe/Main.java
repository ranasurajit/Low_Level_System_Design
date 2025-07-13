package P2_Creational_Design_Patterns.P4_Singleton_Design_Pattern.learning.billpugh.reflectionsafe;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            SingletonBillPughReflectionSafe instance1 = SingletonBillPughReflectionSafe.getInstance();
            Constructor<SingletonBillPughReflectionSafe> constructorSafe = SingletonBillPughReflectionSafe.class
                    .getDeclaredConstructor();
            constructorSafe.setAccessible(true); // Make private constructor accessible

            SingletonBillPughReflectionSafe instance2 = constructorSafe.newInstance();
            System.out.println("Instance 3 hashCode: " + instance1.hashCode());
            System.out.println("Instance 4 hashCode: " + instance2.hashCode());
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
