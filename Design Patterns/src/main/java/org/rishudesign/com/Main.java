package org.rishudesign.com;

public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(); // Different object, but will share class-level lock

        Thread thread1 = new Thread(getRunnable(counter1, "Thread1"));
        Thread thread2 = new Thread(getRunnable(counter2, "Thread2"));

        thread1.start();
        thread2.start();
    }

    private static Runnable getRunnable(Counter counter, String name) {
        return () -> {
            for (int i = 0; i < 1000; i++) {
                counter.incAndGet();
            }
            System.out.println(name + " final count: " + counter.get());
        };
    }
}
