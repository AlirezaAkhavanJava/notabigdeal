package threads.threadCreation;

import threads.basicRaceCondition.ShareResourceSimulation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolWay {

    static ShareResourceSimulation sim = new ShareResourceSimulation();

    static void operate() {
        try (ExecutorService executorService = Executors.newFixedThreadPool(2)) {
            Runnable one = () -> {
                for (int i = 0; i < 100; i++) {
                    sim.increaseNumber();
                    System.out.println(Thread.currentThread().getName() + " " + sim.getValueOfNumber());
                }
            };

            Runnable two = () -> {
                for (int i = 0; i < 100; i++) {
                    sim.increaseNumber();
                    System.out.println(Thread.currentThread().getName() + " " + sim.getValueOfNumber());
                }
            };

            Runnable three = () -> {
                for (int i = 0; i < 100; i++) {
                    sim.increaseNumber();
                    System.out.println(Thread.currentThread().getName() + " " + sim.getValueOfNumber());
                }
            };

            executorService.submit(one);
            executorService.submit(two);
            executorService.submit(three);

            executorService.shutdown();
            try {
                boolean finished = executorService.awaitTermination(10, TimeUnit.SECONDS);
                if (!finished) {
                    System.out.println("Tasks did NOT finish in time.");
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            System.out.println("Final value : " + sim.getValueOfNumber());
        }


    }
}
