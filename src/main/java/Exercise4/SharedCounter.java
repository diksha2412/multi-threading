package Exercise4;

/**
 * Created by ttnd on 29/07/17.
 */
public class SharedCounter {
    private static volatile int counter = 0;

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        SharedCounter s1 = new SharedCounter();
        SharedCounter s2 = new SharedCounter();

        // thread execution
         Thread t1 = new Thread(() -> s1.increment());
         Thread t2 = new Thread(() -> s2.increment());
         t1.start();
         t2.start();
        //-----------------------
        //-----------------------

        long endTime = System.currentTimeMillis();
        System.out.println("Counter: "+s1.counter);
        System.out.println("Total time taken(in millis): "+(endTime-startTime));
    }

    public synchronized void increment() {
        counter++;
    }
}
