package threads.basicRaceCondition;

import java.util.concurrent.locks.ReentrantLock;

public class ShareResourceSimulation {
    int number = 0;
    ReentrantLock lock = new ReentrantLock();

    public void increaseNumber() {
        lock.lock();
        try {
            number++;
        } finally {
            lock.unlock();
        }
    }

    public Integer getValueOfNumber() {
        return number;
    }
}
