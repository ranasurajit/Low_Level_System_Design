package P2_Creational_Design_Patterns.P4_Singleton_Design_Pattern.learning.eager;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        testBasicInstance();
        testForThreadSafety();
    }

    private static void testBasicInstance() {
        EagerSingleton instance1 = EagerSingleton.getInstance();
        EagerSingleton instance2 = EagerSingleton.getInstance();

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
                EagerSingleton instance = EagerSingleton.getInstance();
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
}
