package P2_Creational_Design_Patterns.P4_Singleton_Design_Pattern.learning.threadsafe;

public class SingletonThreadSafe {
    public static SingletonThreadSafe instance;

    private SingletonThreadSafe() {

    }

    public static synchronized SingletonThreadSafe getInstance() {
        if (instance == null) {
            instance = new SingletonThreadSafe();
        }
        return instance;
    }
}
