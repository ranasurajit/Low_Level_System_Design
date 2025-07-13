package P2_Creational_Design_Patterns.P4_Singleton_Design_Pattern.learning.locked;

public class SingletonDoubleCheckedLocking {
    public static volatile SingletonDoubleCheckedLocking instance;

    private SingletonDoubleCheckedLocking() {

    }

    public static SingletonDoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}
