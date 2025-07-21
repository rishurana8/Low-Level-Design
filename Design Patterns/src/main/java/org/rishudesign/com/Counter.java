package org.rishudesign.com;

public class Counter {
    private long count = 0;

    public long incAndGet() {
        synchronized (Counter.class) {  // class-level lock
            this.count++;
            return this.count;
        }
    }

    public long get() {
        synchronized (Counter.class) {  // class-level lock
            return this.count;
        }
    }
}
