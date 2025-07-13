package P2_Creational_Design_Patterns.P4_Singleton_Design_Pattern.learning.nonthreadsafe;

public class SingletonBasic {

    private static SingletonBasic instance;

    private SingletonBasic() {

    }

    public static SingletonBasic getInstance() {
        if (instance == null) {
            setArtificialDelay();
            instance = new SingletonBasic();
        }
        return instance;
    }

    private static void setArtificialDelay() {
        // Artificial delay to increase chance of race condition
        try {
            Thread.sleep(99); // Delay between null check and object creation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
