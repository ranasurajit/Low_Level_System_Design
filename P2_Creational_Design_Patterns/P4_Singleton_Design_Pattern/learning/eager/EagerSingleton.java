package P2_Creational_Design_Patterns.P4_Singleton_Design_Pattern.learning.eager;

public class EagerSingleton {
    public static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("EagerSingleton instance created!");
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Eager Singleton");
    }
}
