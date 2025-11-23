package threads.threadCreation;

public class OperationRunner {
    static void operate() {
        // NormalWay.operate(); == CREATES THREAD DIRECTLY ==
        //ThreadPoolWay.operate(); == A THREAD POOL VIA RUNNABLE ==
        ThreadPoolWithCallable.operation();

        System.out.println("Done");
    }
}
