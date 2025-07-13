package P2_Creational_Design_Patterns.P4_Singleton_Design_Pattern.learning.billpugh.serializationsafe;

import java.io.Serializable;

public class SingletonBillPughSerializationSafe implements Serializable {
    private static boolean isInstanceCreated = false;

    private SingletonBillPughSerializationSafe() {
        if (isInstanceCreated) {
            System.err.println("Instance is created already! Please use getInstance() to use this further!");
        }
        isInstanceCreated = true;
    }

    // Using Inner classes
    private static class Holder {
        private static SingletonBillPughSerializationSafe INSTANCE = new SingletonBillPughSerializationSafe();
    }

    public static SingletonBillPughSerializationSafe getInstance() {
        return Holder.INSTANCE;
    }

    // ✅ Prevent new instance during deserialization
    protected Object readResolve() {
        return getInstance();
    }
}
