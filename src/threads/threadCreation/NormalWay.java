package threads.threadCreation;

public class NormalWay {
    static void operate() {
        Thread threadOne = new Thread(() -> {
            try {
                System.out.println("Thread One Started");
                Thread.sleep(1000);
                System.out.println("Thread One Done !");
            } catch (InterruptedException e) {
                System.out.println("Thread One Interrupted" + e.getMessage());
            }
        });

        threadOne.start();

    }
}
