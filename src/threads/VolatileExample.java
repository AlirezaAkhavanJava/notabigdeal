package threads;

public class VolatileExample {

    volatile static boolean keepRunning = true; //flag

    public static void operate() {
        Thread runner = new Thread(() -> {
            while (keepRunning) {
                System.out.println("I am Still Running ....");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("OOOOOOOOOOOOOHHHHHH SANDWICHOM SHIKASHT !!!!!");
        });
        runner.start();
    }


    public static void shutItDown() {
        keepRunning = false;
    }

    static void main() {
        operate();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        shutItDown();

    }
}
