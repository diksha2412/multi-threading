/**
 * Created by ttnd on 16/07/17.
 */
public class MyThread2 implements Runnable {

    public static void main(String[] args) throws InterruptedException {
        threadInfo();
        Thread t = new Thread(new MyThread2(), "New Executor");
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
        System.out.println("testing..");
        t.join();
        System.out.println("Exiting main..");

    }

    public void run() {
        System.out.println("\nStarting new Thread...");
        threadInfo();
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nExiting Thread...");
    }

    public static void threadInfo() {
        Thread INSTANCE = Thread.currentThread();
        System.out.println("Current thread name -> "+INSTANCE.getName());
        System.out.println("Current thread state -> "+INSTANCE.getState());
        System.out.println("Current thread priority level -> "+INSTANCE.getPriority());
    }
}
