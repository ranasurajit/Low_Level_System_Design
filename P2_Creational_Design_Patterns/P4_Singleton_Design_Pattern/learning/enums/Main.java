package P2_Creational_Design_Patterns.P4_Singleton_Design_Pattern.learning.enums;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws Exception {
        testBasicInstance();
        testForThreadSafety();
        breakSingletonWithReflection();
        breakSingletonWithSerialization();
    }

    private static void testBasicInstance() {
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;

        System.out.println(instance1 == instance2);
        instance1.showMessage();
        instance2.showMessage();
    }

    private static void testForThreadSafety() throws InterruptedException {
        final int THREAD_COUNT = 50;
        Set<Integer> instanceHashCodes = new ConcurrentSkipListSet<>();
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
        CountDownLatch readyLatch = new CountDownLatch(THREAD_COUNT);
        CountDownLatch startLatch = new CountDownLatch(1);
        CountDownLatch doneLatch = new CountDownLatch(THREAD_COUNT);

        Runnable task = () -> {
            try {
                readyLatch.countDown(); // Thread signals it's ready
                startLatch.await(); // Wait for all threads to be ready
                EnumSingleton instance = EnumSingleton.INSTANCE;
                instanceHashCodes.add(instance.hashCode());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                doneLatch.countDown(); // Thread finishes
            }
        };

        for (int i = 0; i < THREAD_COUNT; i++) {
            executor.submit(task);
        }

        readyLatch.await(); // Wait for all threads to be ready
        startLatch.countDown(); // Release all threads at once
        doneLatch.await(); // Wait for all threads to finish

        executor.shutdown();

        System.out.println("Number of unique instances: " + instanceHashCodes.size());
        System.out.println("HashCodes: " + instanceHashCodes);
    }

    private static void breakSingletonWithReflection() throws Exception {
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        Constructor<EnumSingleton> constructor = EnumSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true); // Make private constructor accessible

        EnumSingleton instance2 = constructor.newInstance();
        System.out.println("Instance 1 hashCode: " + instance1.hashCode());
        System.out.println("Instance 2 hashCode: " + instance2.hashCode());

        System.out.println(
                "Reflection broke your Singleton Class as Instance 1 == Instance 2 : " + (instance1 == instance2));
    }

    private static void breakSingletonWithSerialization() throws Exception {
        EnumSingleton instance1 = EnumSingleton.INSTANCE;

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        out.writeObject(EnumSingleton.INSTANCE);

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
        EnumSingleton instance2 = (EnumSingleton) in.readObject(); // New instance!

        System.out.println("Instance 1 hashCode: " + instance1.hashCode());
        System.out.println("Instance 2 hashCode: " + instance2.hashCode());

        System.out.println(
                "Serialization couldn't break your Singleton Class as Instance 1 == Instance 2 : " + (instance1 == instance2));
        in.close();
        out.close();
    }
}
