package threads.threadCreation;

import threads.basicRaceCondition.ShareResourceSimulation;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolWithCallable {
    private static final ShareResourceSimulation resource = new ShareResourceSimulation();

    public static void operation() {
        try (ExecutorService executor = Executors.newCachedThreadPool()) {
            Callable<Integer> one = () -> {
                for (int i = 0; i < 20_000; i++) {
                    resource.increaseNumber();
                }
                return resource.getValueOfNumber();
            };
            Callable<Integer> two = () -> {
                for (int i = 0; i < 20_000; i++) {
                    resource.increaseNumber();
                }
                return resource.getValueOfNumber();
            };

            executor.submit(one);
            executor.submit(two);

            executor.shutdown();
            try {
                boolean over = executor.awaitTermination(300, TimeUnit.MILLISECONDS);
                if (!over) {
                    System.out.println("Executor terminated");
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Final value is " + resource.getValueOfNumber());
        }
    }

}
