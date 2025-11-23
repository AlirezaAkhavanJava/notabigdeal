package threads.basicRaceCondition;

public class ShareResourceSimulation {
    int number = 0;

    public synchronized void increaseNumber() {
        number++;
    }

    public Integer getValueOfNumber() {
        return number;
    }
}
