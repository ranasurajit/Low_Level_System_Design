package P2_Creational_Design_Patterns.P4_Singleton_Design_Pattern.learning.billpugh;

import java.io.Serializable;

public class SingletonBillPugh implements Serializable {

    private SingletonBillPugh() {

    }

    // Using Inner classes
    private static class Holder {
        private static SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return Holder.INSTANCE;
    }
}
