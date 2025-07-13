package P2_Creational_Design_Patterns.P4_Singleton_Design_Pattern.learning.billpugh.reflectionsafe;

public class SingletonBillPughReflectionSafe {

    private static boolean isInstanceCreated = false;

    private SingletonBillPughReflectionSafe() {
        if (isInstanceCreated) {
            throw new RuntimeException("Instance is created already! Please use getInstance() to use this further!");
        }
        isInstanceCreated = true;
    }

    private static class Holder {
        private static SingletonBillPughReflectionSafe INSTANCE = new SingletonBillPughReflectionSafe();
    }

    public static SingletonBillPughReflectionSafe getInstance() {
        return Holder.INSTANCE;
    }
}
