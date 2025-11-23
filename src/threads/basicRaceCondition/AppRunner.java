package threads.basicRaceCondition;

public class AppRunner {
    static void operate() throws InterruptedException {

        ShareResourceSimulation resourceSimulation = new ShareResourceSimulation();
        Thread threadOne = new Thread(new ThreadActionImpl(resourceSimulation, "One ==>"));
        Thread threadTwo = new Thread(new ThreadActionImpl(resourceSimulation, "Two ==>"));

        threadOne.start();
        threadTwo.start();


        //main thread should wait
        threadOne.join(100, 7);
        threadTwo.join(100, 7);
    }
}
