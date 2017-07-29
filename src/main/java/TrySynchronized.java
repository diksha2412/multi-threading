/**
 * Created by ttnd on 29/07/17.
 */
public class TrySynchronized {

    static class V {
        volatile static int counter;
    }

    TrySynchronized(){
        synchronized (TrySynchronized.class){
            V.counter++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(()-> execute());
        Thread thread2 = new Thread(()-> execute());

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(V.counter);
    }

    static void execute(){
        for (int i=0;i<100;i++)
            new TrySynchronized();
    }
}
